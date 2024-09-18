public class overloading2 {
    public static int sum(int a,int b){
        return a+b;
    }
    public static double sum(double a , double b ){
        return a+b;
    }
    public static float  mul(  float a , float b ){
        return a*b;
    }
    public static int  div(int a , int b ){
        return a/b;
    }
    public static void main(String[] args) {
        int a =5;
        int b= 5;
        System.out.println(sum(a,b));
        System.out.println(sum(a,b));
        System.out.println(mul(a, b));
        System.out.println(div(a, b));
    }
}
