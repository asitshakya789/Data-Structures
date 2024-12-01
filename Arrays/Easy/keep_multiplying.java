// </-You are given an array of integers nums. You are also given an integer original which is the first number that needs to be searched for in nums.

// You then do the following steps:

// If original is found in nums, multiply it by two (i.e., set original = 2 * original).
// Otherwise, stop the process.
// Repeat this process with the new number as long as you keep finding the number.
// Return the final value of original.

 

// Example 1:

// Input: nums = [5,3,6,1,12], original = 3
// Output: 24
// Explanation: 
// - 3 is found in nums. 3 is multiplied by 2 to obtain 6.
// - 6 is found in nums. 6 is multiplied by 2 to obtain 12.
// - 12 is found in nums. 12 is multiplied by 2 to obtain 24.
// - 24 is not found in nums. Thus, 24 is returned.
// Example 2:

// Input: nums = [2,7,9], original = 4
// Output: 4
// Explanation:
// - 4 is not found in nums. Thus, 4 is returned.

import java.util.HashSet;

public class keep_multiplying {

    public static int keepMultiplying(int[] nums, int original) {
        HashSet<Integer> numset = new HashSet<>();
        for( int  num : nums){
            numset.add(num);

        }
        while (numset.contains(original)) {
            original = original*2;
        }
        return original;
    }
    public static void main(String[] args) {
        int[] nums = { 2, 7, 9};
        int original = 4;
        System.out.println(keepMultiplying(nums, original));

    }
}