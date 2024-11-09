import java.util.Arrays;

public class CookiesSize {

    public int childrens(int greed[], int size[]) {
        // Sort the greed and size arrays
        Arrays.sort(greed);
        Arrays.sort(size);

        int n = greed.length;
        int m = size.length;
        int left = 0; 
        int right = 0; 

        // Use two pointers to find the maximum number of satisfied children
        while (left < n && right < m) {
            if (size[right] >= greed[left]) {
                // If the cookie can satisfy the child, move to the next child
                left++;
            }
            // Move to the next cookie in either case
            right++;
        }
        return left; // Number of satisfied children
    }

    public static void main(String[] args) {
        CookiesSize obj = new CookiesSize();
        int greed[] = {1, 2, 3, 4, 5};
        int size[] = {1, 2, 3, 4, 5};
        System.out.println(obj.childrens(greed, size)); // Output: 5
    }
}