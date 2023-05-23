/**
 * 2023.05.23
 * 198. House Robber
 * https://leetcode.com/problems/house-robber
 *
 * Site: Leetcode
 * Level: Medium
 * */
class Solution {
    public int rob(int[] nums) {
        int[][] dp = new int[nums.length][2];
        // if 0 : not steal
        // if 1 : steal
        dp[0][0] = 0;
        dp[0][1] = nums[0];
        for (int i=1; i<nums.length; i++) {
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1]);
            dp[i][1] = dp[i-1][0] + nums[i];
        }

        return Math.max(dp[nums.length-1][0], dp[nums.length-1][1]);
    }
}