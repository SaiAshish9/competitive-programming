internal class Solution {
    fun intToRoman(num: Int): String {
        var num = num
        val base = intArrayOf(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1)
        val chars = arrayOf("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I")
        var result = ""
        for (i in base.indices) {
            if (num / base[i] > 0) {
                for (j in 0 until num / base[i]) {
                    result += chars[i]
                }
                num -= num / base[i] * base[i]
            }
        }
        return result
    }
}

fun main(){
    var s:Solution=Solution()
    print(s.intToRoman(8))
}