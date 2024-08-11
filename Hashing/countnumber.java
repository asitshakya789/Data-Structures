/**
 * countnumber
 */
public class countnumber {
    public static void main(String[] args) {
        int n = 5;
        int count = 0;
        for(int i = 1; i <= n; i++) {
            if(i % 3 == 0) {
                count++;
            }
        }
        System.out.println("Number of multiples of 3 between 1 and " + n + ": " + count);
    }
    
}