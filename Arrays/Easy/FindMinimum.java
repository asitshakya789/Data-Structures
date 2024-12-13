public class FindMinimum {
    public int findMinimum(int arr[]) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) { // Start from index 1
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        FindMinimum finder = new FindMinimum(); 
        int[] arr = {2, 3, 5, 6, 7, 3, 2, 5, 6}; 
        System.out.println(finder.findMinimum(arr)); 
    }
}