import java.io.*

internal object Main {
    var ps: PrintStream = System.out
    fun findMissingPositive(A: IntArray): Int {
        val n = A.size
        val present = BooleanArray(n + 1)
        for (i in 0 until n) {
            if (A[i] > 0 && A[i] <= n) present[A[i]] = true
        }
        for (i in 1..n) if (!present[i]) return i
        return n + 1
    }

    fun main(vararg s: String?) {
        val nums = intArrayOf(0, -1, 3, 1)
        ps.println(findMissingPositive(nums))
    }
}