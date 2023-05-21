/**
 * 2023.05.22
 * 96. Unique Binary Search Trees
 * https://leetcode.com/problems/unique-binary-search-trees
 *
 * Site: Leetcode
 * Level: Medium
 * */

class Solution {
    /*
        dp[4] = (dp[0] * dp[3])
              + (dp[1] * dp[2])
              + (dp[2] * dp[1])
              + (dp[3] * dp[0])
    */
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i=2; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                dp[i] += dp[j-1] * dp[i-j];
            }
        }
        return dp[n];
    }
}