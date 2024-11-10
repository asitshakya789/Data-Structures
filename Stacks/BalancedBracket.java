import java.util.Stack;

public class BalancedBracket {
    public static int isBalanced(String s) {
        int n = s.length();
        
        // If the length of the string is odd, it cannot be balanced
        if (n % 2 != 0) {
            return n;
        }

        Stack<Character> stack = new Stack<>();
        
        // Iterate through each character in the string
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            // Push opening brackets onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                // Check for closing brackets
                if (stack.isEmpty()) {
                    return i + 1; // Return the position of the unmatched closing bracket
                }
                // Check if the closing bracket matches the top of the stack
                char top = stack.pop();
                if ((ch == ')' && top != '(') || 
                    (ch == '}' && top != '{') || 
                    (ch == ']' && top != '[')) {
                    return i + 1; // Return the position of the unmatched closing bracket
                }
            }
        }
        
        // If the stack is not empty, there are unmatched opening brackets
        if (!stack.isEmpty()) {
            return n + 1; // Return the position after the last character
        }
        
        // If balanced, return 0
        return 0;
    }

    public static void main(String[] args) {
        String testString = "{[()]}";
        int result = isBalanced(testString);
        if (result == 0) {
            System.out.println("The string is balanced.");
        } else {
            System.out.println("The string is not balanced. Error at position: " + result);
        }
    }
}