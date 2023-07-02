/**
 * 2023.06.28
 * 72. Edit Distance
 * https://leetcode.com/problems/edit-distance
 *
 * Site: Leetcode
 * Level: Medium
 * */
class Solution {
    public int minDistance(String word1, String word2) {
        // dp[i][j] : word1[0...i-1]에서 word2[0...j-1]로 바꾸는데 필요한 최솟값
        // 1. word1[i-1] == word2[j-1] : dp[i][j] = dp[i-1][j-1]
        // 2. dp[i][j]
        // 2-1. dp[i-1][j-1] + 1 : replace word1[i-1] with word2[j-1]
        // 2-2. dp[i-1][j] + 1 : delete word1[i-1]
        // 2-3. dp[i][j-1] + 1 : insert word2[j-1]
        int m = word1.length();
        int n = word2.length();

        int[][] dp = new int[m+1][n+1];

        for (int i=1; i<=m; i++) {
            dp[i][0] = i;
        }
        for (int j=1; j<=n; j++) {
            dp[0][j] = j;
        }
        for (int i=1; i<=m; i++) {
            for (int j=1; j<=n; j++) {
                if (word1.charAt(i-1) == word2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1])) + 1;
                }
            }
        }

        return dp[m][n];
    }
}