import java.util.*

internal class Main {
    fun generateParenthesis(n: Int): List<String> {
        val result: MutableList<String> = LinkedList()
        process("", n, n, result)
        return result
    }

    private fun process(prefix: String, left: Int, right: Int, result: MutableList<String>) {
        if (left == 0 && right == 0) {
            result.add(prefix)
            return
        }
        if (left > 0) {
            process("$prefix(", left - 1, right, result)
        }
        if (left < right) {
            process("$prefix)", left, right - 1, result)
        }
    }

    companion object {
        @JvmStatic
        fun main(s: Array<String>) {
            val sol = Main()
            println(sol.generateParenthesis(3))
        }
    }
}