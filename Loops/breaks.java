import java.util.*;
public class breaks {
    public static void main(String args[]) {
        for(int i=1 ;i<=5;i++){
            if(i==3){
                break;
            }
            System.out.println(i);
        }
        System.out.println("out of loop");
    }
}