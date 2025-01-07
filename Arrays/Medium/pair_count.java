public class pair_count {
    int countPairs(int arr[], int target) {
        
        if (arr == null || arr.length < 2) return 0;

        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) { 
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        pair_count pc = new pair_count();
        int[] number = {2, 4, 3, 5, 6, 7};
        int target = 9;
        System.out.println(pc.countPairs(number, target));
    }
}
