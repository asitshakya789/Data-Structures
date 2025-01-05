import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class closest_pair_sum {

     public List<Integer> sumClosest(int[] arr, int target) {
        int n = arr.length;
        if (n < 2) return new ArrayList<>();

        Arrays.sort(arr);
        int left = 0, right = n - 1;
        int diff = Integer.MAX_VALUE;
        int maxAbsDiff = -1;
        List<Integer> result = new ArrayList<>();

        while (left < right) {
            int sum = arr[left] + arr[right];
            int currentDiff = Math.abs(target - sum);
            int absDiff = arr[right] - arr[left];

            if (currentDiff < diff || (currentDiff == diff && absDiff > maxAbsDiff)) {
                diff = currentDiff;
                maxAbsDiff = absDiff;
                result.clear();
                result.add(arr[left]);
                result.add(arr[right]);
            }

            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        closest_pair_sum cps = new closest_pair_sum();
        int[] arr = {10, 22, 28, 29, 30, 40};
        int target = 54;
        List<Integer> result = cps.sumClosest(arr, target);
        System.out.println(result);
    }
}