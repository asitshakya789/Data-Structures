package Recursion;

public class printdecresing {

    public static void pd(int n){
        if(n == 0 ){
            return;
        }
        System.out.println(n);
        pd(n-1);
    }
    public static void main(String[] args) {
        pd(5);
        
    }

    
}