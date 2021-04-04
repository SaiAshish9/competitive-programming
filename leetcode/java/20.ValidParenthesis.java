import java.util.*;

class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> match = new HashMap<Character, Character>();
        match.put(')', '(');
        match.put('}', '{');
        match.put(']', '[');
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
                continue;
            }
            if (stack.size() == 0 || match.get(s.charAt(i)) != stack.pop()) {
                return false;
            }
        }
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
}