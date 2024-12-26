package GFG;

import java.util.HashSet;

class Two_sum {
    boolean twoSum(int arr[], int target) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        
        HashSet<Integer> seenNumbers = new HashSet<>();
        
        for (int num : arr) {
            int complement = target - num;
            if (seenNumbers.contains(complement)) {
                return true;
            }
            
            seenNumbers.add(num);
        }
        return false;
    }
}