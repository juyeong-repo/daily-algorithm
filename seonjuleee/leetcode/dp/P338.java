/**
 * 2023.05.20
 * 338. Counting Bits
 * https://leetcode.com/problems/counting-bits
 *
 * Site: Leetcode
 * Level: Easy
 * */

class Solution {
    public int[] countBits(int n) {
        // n is odd: dp[n] = dp[n-1] + 1
        // n is even: dp[n] = dp[n/2]
        int[] dp = new int[n+1];
        dp[0] = 0;
        if (n == 0) return dp;
        dp[1] = 1;
        for (int i=2; i<=n; i++) {
            if (i % 2 == 1) {
                dp[i] = dp[i-1] + 1;
            } else {
                dp[i] = dp[i/2];
            }
        }
        return dp;
    }
}