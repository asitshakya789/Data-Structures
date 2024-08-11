public class oneTon {
    static Object number(int i,int n ){
        if(i>n){
            return n;
        }
        System.out.println(i);
        return number(i+1, n);
    }
    public static void main(String[] args) {
        int n = 5 ;
        int i =1 ;
        number(i, n);
    }
}
