/**
 * 2023.09.09
 * 1004. Max Consecutive Ones III
 * https://leetcode.com/problems/max-consecutive-ones-iii
 *
 * Site: Leetcode
 * Level: Medium
 * */
class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int j=0;
        while (j<nums.length) {
            if (nums[j] == 0) {
                k--;
            }
            j++;
            if (k < 0) {
                if (nums[i] == 0) {
                    k++;
                }
                i++;
            }
        }
        return j-i;
    }
}