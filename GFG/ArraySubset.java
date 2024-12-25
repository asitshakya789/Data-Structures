package GFG;

import java.util.HashSet;

public class ArraySubset {
    public static boolean isSubset(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {
            if (!set.contains(num)) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        int arr1[] = {11, 1, 13, 21, 3, 7};
        int arr2[] = {11, 3, 7, 1};

        if (isSubset(arr1, arr2)) {
            System.out.println("arr2[] is a subset of arr1[]");
        } else {
            System.out.println("arr2[] is not a subset of arr1[]");
        }
    }
}
