import java.io.*

internal object Main {
    var ps: PrintStream = System.out
    fun multiply(num1: String?, num2: String?): String {
        val n1: String = StringBuilder(num1).reverse().toString()
        val n2: String = StringBuilder(num2).reverse().toString()
        val d = IntArray(n1.length() + n2.length())
        for (i in 0 until n1.length()) {
            for (j in 0 until n2.length()) {
                d[i + j] += (n1.charAt(i) - '0') * (n2.charAt(j) - '0')
            }
        }
        var result = ""
        for (i in d.indices) {
            val digit = d[i] % 10
            val carry = d[i] / 10
            if (i + 1 < d.size) {
                d[i + 1] += carry
            }
            result = digit.toString() + "" + result
        }
        var index = 0
        while (index < result.length() - 1 && result.charAt(index) === '0') {
            index++
        }
        return result.substring(index)
    }

    fun main(vararg s: String?) {
        ps.println(multiply("7", "8"))
    }
}