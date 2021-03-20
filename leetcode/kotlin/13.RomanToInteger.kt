internal class Main {
    fun romanToInt(s: String): Int {
        val helper = HashMap<Char, Int>()
        initHelper(helper)
        var result = 0
        for (i in s.indices) {
            if (i > 0 && helper[s[i]]!! > helper[s[i - 1]]!!) {
                result -= 2 * helper[s[i - 1]]!!
            }
            result += helper[s[i]]!!
        }
        return result
    }

    private fun initHelper(helper: HashMap<Char, Int>) {
        helper['M'] = 1000
        helper['D'] = 500
        helper['C'] = 100
        helper['L'] = 50
        helper['X'] = 10
        helper['V'] = 5
        helper['I'] = 1
    }

    companion object {
        @JvmStatic
        fun main(s: Array<String>) {
            val m = Main()
            println(m.romanToInt("IV"))
        }
    }
}