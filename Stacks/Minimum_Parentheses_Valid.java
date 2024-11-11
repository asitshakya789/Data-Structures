import java.util.Stack;

public class Minimum_Parentheses_Valid {
    public static int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.peek() == ')') {
                    stack.push(ch);
                } else {
                    stack.pop(); // Match with the last opening parenthesis
                }
            }
        }
        return stack.size(); // The size of the stack gives the unmatched parentheses
    }

    public  static int  minimumsecond(String s ){
        int open = 0 ; 
        int close = 0 ; 
        for(int  i= 0 ; i< s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                open++;
            }else{
                if(open<=0){
                    close++;
                }else{
                    open--;
                }
              
            }
        }
        return (open+close);
    }
    public static void main(String[] args) {
        Minimum_Parentheses_Valid obj = new Minimum_Parentheses_Valid();
        String str = "(((())())()))";
        // int result = obj.minAddToMakeValid(str);
        int result = obj.minimumsecond(str);
        System.out.println("Minimum parentheses to add: " + result);
    }
}