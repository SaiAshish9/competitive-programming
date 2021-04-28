class Solution {

    fun longestValidParentheses(s:String):Int {
       var maxans = 0
        val stack = Stack<Int>()
        stack.push(-1)
        for (i in 0 until s.length) {
            if (s[i] == '(') {
                stack.push(i)
            } else {
                stack.pop()
                if (stack.empty()) {
                    stack.push(i)
                } else {
                    maxans = Math.max(maxans, i - stack.peek())
                }
            }
        }
        return maxans
    }
}