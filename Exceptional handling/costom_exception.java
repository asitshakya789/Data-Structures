/**
 * costom_exception
 */
public class costom_exception {

    public static void main(String[] args) {
        int a =10;
        int b= 5 ;
        int c = 5 ;
        int x, y;
        try {
            x = a / (b-c);
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("division by zero");
        }
        y = a /(b+c);
        System.out.println("y "+y);
    }
}