/**
 * 2023.11.02
 * 977. Squares of a Sorted Array
 * https://leetcode.com/problems/squares-of-a-sorted-array
 *
 * Site: Leetcode
 * Level: Easy
 * */
import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
        for (int i=0; i<nums.length; i++) {
            int n = nums[i];
            nums[i] = n * n;
        }
        Arrays.sort(nums);
        return nums;
    }
}