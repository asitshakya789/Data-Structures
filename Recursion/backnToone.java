public class backnToone {
    static void backtracingnumber(int  i ,int n){
        if(i>n){
            return;
        }
        backtracingnumber(i+1, n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        int i = 1 ;
        int n =5 ;
        backtracingnumber(i, n);
    }
}
