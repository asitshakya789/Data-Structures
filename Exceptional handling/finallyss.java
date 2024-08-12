public class finallyss {
    public static void main(String[] args) {
        int a=2;
        int b =2 ;
        int c;
        try {
            c = a / b-a ;
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("Cnat't deivide by zero");
        }
        finally{
            System.out.println("Code run succesfully");
        }
    }
    
}
