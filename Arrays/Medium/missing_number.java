import java.util.HashSet;

public class missing_number {

       public int missingNumber(int[] arr) {
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        
    
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                set.add(arr[i]);
            }
        }
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        
        return n + 1;
    }
    public static void main(String[] args) {
        missing_number m = new missing_number();
        int[] arr = {1, 2, 4, 6, 3};
        System.out.println(m.missingNumber(arr));
        
    }
    
}