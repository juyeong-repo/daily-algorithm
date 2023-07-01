/**
 * 2023.07.01
 * 42897. 도둑질
 * https://school.programmers.co.kr/learn/courses/30/lessons/42897
 *
 * Site: Programmers
 * Level: 4
 * */
class Solution {
    public int solution(int[] money) {
        int answer = 0;
        int[][] dp = new int[2][money.length];
        // dp[0] : 첫번째 집을 털지 않을 때
        // dp[1] : 첫번째 집을 털 때
        dp[0][0] = 0;
        dp[1][0] = money[0];
        dp[0][1] = money[1];
        dp[1][1] = dp[1][0];
        int len = money.length;

        for (int i=2; i<len-1; i++) {
            dp[0][i] = Math.max(dp[0][i-1], dp[0][i-2] + money[i]);
            dp[1][i] = Math.max(dp[1][i-1], dp[1][i-2] + money[i]);
        }

        dp[0][len-1] = Math.max(dp[0][len-2], dp[0][len-3] + money[len-1]);
        dp[1][len-1] = dp[1][len-2];

        return Math.max(dp[0][len-1], dp[1][len-1]);
    }
}