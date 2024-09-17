import java.util.*;
public class main {
    public static void main(String[] args) {
        Stack<Integer> stack  = new Stack<>();
        stack.push(1);
        System.out.println(stack+ "->" + stack.peek()+"->" + stack.size() );
        stack.push(2);
        System.out.println(stack+ "->" + stack.peek()+"->" + stack.size() );

        stack.push(3);
        System.out.println(stack+ "->" + stack.peek()+"->" + stack.size() );
        stack.pop();
        System.out.println(stack+ "->" + stack.peek()+"->" + stack.size() );
        stack.pop();
        System.out.println(stack+ "->" + stack.peek()+"->" + stack.size() );
        stack.pop();
        System.out.println(stack+ "->" + stack.size() );
    }
    
}