import java.io.*

object Main {
    var ps: PrintStream = System.out
    fun rotate(matrix: Array<IntArray>) {
        val n = matrix.size
        for (i in 0 until n / 2) {
            for (j in 0 until Math.ceil(n.toDouble() / 2.0)) {
                val temp = matrix[i][j]
                matrix[i][j] = matrix[n - 1 - j][i]
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j]
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i]
                matrix[j][n - 1 - i] = temp
            }
        }
    }

    fun display(arr: Array<IntArray>) {
        for (i in arr) {
            for (j in i) {
                ps.print("$j ")
            }
            ps.println("")
        }
    }

    fun main(vararg s: String?) {
        val arr = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))
        display(arr)
        rotate(arr)
        ps.println("################")
        display(arr)
    }
}