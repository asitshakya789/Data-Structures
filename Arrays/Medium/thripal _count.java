import java.util.Arrays;

class triangle_count {
    static int countTriangles(int arr[]) {
        int n = arr.length;
        int count = 0;

        Arrays.sort(arr);

        for (int i = n - 1; i >= 2; i--) {
            int left = 0;
            int right = i - 1;

            while (left < right) {
                if (arr[left] + arr[right] > arr[i]) {
                    count += (right - left);
                    right--;
                } else {
                    left++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = {10, 21, 22, 100, 101, 200, 300};
        System.out.println("Number of triangles possible: " + countTriangles(arr));
    }
}
