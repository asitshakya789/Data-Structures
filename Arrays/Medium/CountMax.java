import java.util.HashSet;
import java.util.Set;

public class CountMax {
    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> bannedSet = new HashSet<>();
        for (int num : banned) {
            bannedSet.add(num);
        }
        
        int count = 0;
        int currentSum = 0;
        
        for (int i = 1; i <= n; i++) {
            if (!bannedSet.contains(i)) {
                if (currentSum + i <= maxSum) {
                    currentSum += i;
                    count++;
                } else {
                    break;
                }
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        CountMax countMax = new CountMax();
        
        int[] banned = {2, 3, 5};
        int n = 10;
        int maxSum = 20;
        
        int result = countMax.maxCount(banned, n, maxSum);
        System.out.println("Maximum count of integers: " + result);
    }
}