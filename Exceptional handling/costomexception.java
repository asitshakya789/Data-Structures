import java.io.InvalidClassException;

public class costomexception {
    public static void main(String[] args) {
        
    }
    public static void cheackage(int age)throws Exception{
        if(age<18) {
            throw new Exception("age is invalid");
        }
        else {
            System.out.println("age is valid");
        }
    }
}
class InvalidAgeExcption extends Exception{
    public InvalidAgeExcption(String sms){
        super(sms);
    }

}
