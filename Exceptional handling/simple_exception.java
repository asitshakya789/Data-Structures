/**
 * simple_exception
 */
public class simple_exception {
    public static void main(String[] args) {
        String str = "Null";
        try {
            System.out.println(str.length());
        }catch( NullPointerException e){
            System.out.println("Exception caught");
        }
    }
}