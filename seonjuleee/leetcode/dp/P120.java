/**
 * 2023.05.25
 * 120. Triangle
 * https://leetcode.com/problems/triangle
 *
 * Site: Leetcode
 * Level: Medium
 * */

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] dp = new int[triangle.size()];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i=0; i<triangle.size(); i++) {
            for (int j=i; j>0; j--) {
                dp[j] = Math.min(dp[j-1], dp[j]) + triangle.get(i).get(j);
            }
            dp[0] += triangle.get(i).get(0);
        }

        int answer = Integer.MAX_VALUE;
        for (int d : dp) {
            answer = Math.min(answer, d);
        }

        return answer;
    }
}