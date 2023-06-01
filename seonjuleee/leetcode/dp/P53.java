/**
 * 2023.05.26
 * 213. Maximum Subarray
 * https://leetcode.com/problems/maximum-subarray
 *
 * Site: Leetcode
 * Level: Medium
 * */
class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i=0; i<nums.length; i++) {
            sum += nums[i];
            max = Math.max(sum, max);

            if (sum < 0) sum = 0;
        }
        return max;
    }
}