import java.util.*
import kotlin.collections.HashMap

internal class Main {
    fun letterCombinations(digits: String): List<String> {
        val keyboard = HashMap<Char, String>()
        initKeyboard(keyboard)
        val result: MutableList<String> = LinkedList()
        if (digits.isEmpty()) {
            return result
        }
        compile(digits, "", 0, keyboard, result)
        return result
    }

    private fun compile(
        digits: String,
        prefix: String,
        start: Int,
        keyboard: HashMap<Char, String>,
        result: MutableList<String>
    ) {
        if (start == digits.length) {
            result.add(prefix)
            return
        }
        val cand = keyboard[digits[start]]
        for (element in cand!!) {
            compile(digits, prefix + element, start + 1, keyboard, result)
        }
    }

    private fun initKeyboard(keyboard: HashMap<Char, String>) {
        keyboard['2'] = "abc"
        keyboard['3'] = "def"
        keyboard['4'] = "ghi"
        keyboard['5'] = "jkl"
        keyboard['6'] = "mno"
        keyboard['7'] = "pqrs"
        keyboard['8'] = "tuv"
        keyboard['9'] = "wxyz"
    }

    companion object {
        @JvmStatic
        fun main(s: Array<String>) {
            val m = Main()
            println(m.letterCombinations("234").toString())
        }
    }
}