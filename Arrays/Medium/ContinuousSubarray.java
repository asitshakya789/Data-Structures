import java.util.PriorityQueue;

public class ContinuousSubarray {
    public long continuousSubarraySum(int[] nums) {
        long totalSum = 0;
        int n = nums.length;

        for (int start = 0; start < n; start++) {
            long currentSum = 0;
            for (int end = start; end < n; end++) {
                currentSum += nums[end];
                totalSum += currentSum;
            }
        }

        return totalSum;
    }

    public static void main(String[] args) {
        ContinuousSubarray cs = new ContinuousSubarray();
        int[] nums = {5,4,2,4};
        long result = cs.continuousSubarraySum(nums);
        System.out.println("Total sum of continuous subarrays: " + result);
    }
}