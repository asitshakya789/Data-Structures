package Recursion;

public class printskip {

    public static void printskipnum(int n){
        if(n ==0 ){
            return ;
        }
        if(n %2 == 1){
            System.out.println(n);
        }
        printskipnum(n-1);
        if(n % 2 == 0){
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        printskipnum(10);
    }
    
}
