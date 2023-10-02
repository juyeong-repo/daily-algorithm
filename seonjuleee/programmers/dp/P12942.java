/**
 * 2023.10.02
 * 12942. 최적의 행렬 곱셈
 * https://school.programmers.co.kr/learn/courses/30/lessons/12942
 *
 * Site: Programmers
 * Level: 3
 * */

import java.util.*;
class Solution {
    public int solution(int[][] matrix_sizes) {
        int answer = 0;
        int n = matrix_sizes.length;
        int[][] dp = new int[n][n];
        for (int i=0; i<n; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }

        // initialize
        for (int i=0; i<n; i++) {
            dp[i][i] = 0;
        }

        for (int i=1; i<n; i++) {
            for (int start = 0; start < n; start++) {
                int end = start + i;
                if (end >= n) break;

                for (int fix = start; fix < end; fix++) {
                    dp[start][end] = Math.min(dp[start][end], dp[start][fix] + dp[fix+1][end] + (matrix_sizes[start][0] * matrix_sizes[fix][1] * matrix_sizes[end][1]));
                }
            }
        }

        return dp[0][n-1];
    }
}