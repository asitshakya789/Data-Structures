import java.util.Arrays;

public class count_pairsum {
    int countPairs(int arr[], int target) {
        Arrays.sort(arr);
        int count = 0, left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] + arr[right] < target) {
                count += (right - left);
                left++;
            } else {
                right--;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        count_pairsum obj = new count_pairsum();
        int arr[] = {1, 5, 7, 1};
        int target = 6;
        System.out.println(obj.countPairs(arr, target));
    }
}
