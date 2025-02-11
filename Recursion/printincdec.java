package Recursion;

public class printincdec {
    
    public static void pid(int  n){
        if(n==0){
            return; 
        }
        System.out.println(n);
        pid(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        pid(5);
    }
}
