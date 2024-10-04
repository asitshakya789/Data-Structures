public class RearrangeElements {
    public int[] rearrangeArray(int[] nums) {
        int[] res = new int[nums.length];
        int pos = 0;
        int neg = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                if (neg < nums.length) {
                    res[neg] = nums[i];
                    neg++;
                } else {
                    res[pos] = nums[i];
                    pos++;
                }
            } else {
                if (pos < nums.length) {
                    res[pos] = nums[i];
                    pos++;
                } else {
                    res[neg] = nums[i];
                    neg++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        RearrangeElements obj = new RearrangeElements();
        int[] nums = {1, 2, 3, -4, -5, 6, -7, 6};
        try {
            int[] result = obj.rearrangeArray(nums);
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}