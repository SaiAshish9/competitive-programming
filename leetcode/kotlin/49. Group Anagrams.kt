import java.util.*
import java.io.*

internal object Main {
    var ps: PrintStream = System.out
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val result: ArrayList<List<String>> = ArrayList<List<String>>()
        val helper: HashMap<String, Integer> = HashMap<String, Integer>()
        for (i in strs.indices) {
            val tmpChar: CharArray = strs[i].toCharArray()
            Arrays.sort(tmpChar)
            val tmp = String(tmpChar)
            if (helper.containsKey(tmp)) {
                result.get(helper.get(tmp)).add(strs[i])
                continue
            }
            val curr: List<String> = LinkedList<String>()
            curr.add(strs[i])
            result.add(curr)
            helper.put(tmp, result.size() - 1)
        }
        return result
    }

    fun main(vararg s: String?) {
        val dataSet = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")
        for (c in groupAnagrams(dataSet)) {
            c.stream().forEach(ps::println)
            ps.println("###############")
        }
    }
}