import java.util.Stack;

public class Minimum_Add {
   
   
   public static int minimumaddtomakeparenthis(String s){
  
    Stack <Character> stack = new Stack<>();
    int  n = s.length();
    for(int i =0 ; i< n  ; i ++){
        char ch = s.charAt(i);
        if(ch == '('){
            stack.push(ch);
        }else{
            if(!stack.isEmpty() || stack.peek() ==')'){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
    }
    return stack.size();
   }
   
    public static void main(String[] args) {
        
        System.out.println(minimumaddtomakeparenthis("((())(")); // 0
    }
}
