import java.util.*
import kotlin.collections.HashMap

internal class Solution {
    fun isValid(s: String): Boolean {
        val match = HashMap<Char, Char>()
        match[')'] = '('
        match['}'] = '{'
        match[']'] = '['
        val stack = Stack<Char>()
        for (i in s.indices) {
            if (s[i] == '(' || s[i] == '{' || s[i] == '[') {
                stack.push(s[i])
                continue
            }
            if (stack.size == 0 || match[s[i]] !== stack.pop()) {
                return false
            }
        }
        return stack.size == 0
    }
}