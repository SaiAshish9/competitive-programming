import java.util.*

internal object Main {
    private fun findSubstring(s: String, words: Array<String>): ArrayList<Int> {
        val size_word = words[0].length
        val word_count = words.size
        val size_l = size_word * word_count
        val res = ArrayList<Int>()
        val n = s.length
        if (size_l > n) {
            return res
        }
        val hashMap = HashMap<String, Int>()
        for (word in words) {
            hashMap[word] = hashMap.getOrDefault(word, 0) + 1
        }
        for (i in 0..n - size_l) {
            val tempMap = hashMap.clone() as HashMap<String, Int>
            var j = i
            var count = word_count
            while (j < i + size_l) {
                val word = s.substring(j, j + size_word)
                if (!hashMap.containsKey(word) || tempMap[word] == 0) {
                    break
                } else {
                    tempMap[word] = tempMap[word]!! - 1
                    count--
                }
                j += size_word
            }
            if (count == 0) {
                res.add(i)
            }
        }
        return res
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val S = "barfoothefoobarman"
        val L = ArrayList(Arrays.asList("foo", "bar"))
        val indices = findSubstring(S, L.toTypedArray())
        for (i in indices) {
            println(i)
        }
    }
}