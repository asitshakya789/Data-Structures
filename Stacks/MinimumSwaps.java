public class MinimumSwaps {
    public static int minSwaps(String s) {
        int n = s.length();
        int open = 0;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                open++;
            } else {
                open--;
                if (open < 0) {
                    ans++;
                    open = 0; 
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(minSwaps("()(()())")); // Expected output: 0
        System.out.println(minSwaps(")(")); // Expected output: 1
        System.out.println(minSwaps(")))(((")); // Expected output: 3
    }
}