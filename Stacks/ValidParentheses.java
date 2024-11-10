import java.util.Stack;

public class ValidParentheses {
    
    public String isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return "NO";
            }
        }
        
        return stack.isEmpty() ? "YES" : "NO";
    }

}