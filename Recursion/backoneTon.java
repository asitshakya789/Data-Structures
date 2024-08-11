public class backoneTon {
    static void backoneton(int i ,int n){
        if(i>n){
            return;
        }
        backoneton(i, n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n =5 ;
        int  i =1 ;
        backoneton(i, n);
    }
}
