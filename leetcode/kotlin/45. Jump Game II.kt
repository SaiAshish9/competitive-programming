import java.io.*

internal object Main {
    var ps: PrintStream = System.out
    fun jump(n: IntArray): Int {
        val len = n.size - 1
        var curr = -1
        var next = 0
        var ans = 0
        var i = 0
        while (next < len) {
            if (i > curr) {
                ans++
                curr = next
            }
            next = Math.max(next, n[i] + i)
            i++
        }
        return ans
    }

    fun main(vararg s: String?) {
        ps.println(jump(intArrayOf(2, 3, 1, 1, 4)))
    }
}