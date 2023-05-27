/**
 * 2023.05.27
 * 72413. 합승 택시 요금
 * https://school.programmers.co.kr/learn/courses/30/lessons/72413
 *
 * Site: Programmers
 * Level: 3
 * */

import java.util.*;
class Solution {
    public int solution(int n, int s, int a, int b, int[][] fares) {
        int[][] dist = new int[n+1][n+1];
        // init
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                dist[i][j] = 100000 * n;
            }
        }
        for (int i=1; i<=n; i++) {
            dist[i][i] = 0;
        }
        for (int[] f : fares) {
            dist[f[0]][f[1]] = f[2];
            dist[f[1]][f[0]] = f[2];
        }

        // floyd-warshall
        for (int k=1; k<=n; k++) {
            for (int i=1; i<=n; i++) {
                for (int j=1; j<=n; j++) {
                    dist[i][j] = Math.min(dist[i][k] + dist[k][j], dist[i][j]);
                }
            }
        }

        // 최저 택시 요금 계산
        int answer = Integer.MAX_VALUE;
        for (int k=1; k<=n; k++) {
            answer = Math.min(answer, dist[s][k] + dist[a][k] + dist[b][k]);
        }

        return answer;
    }
}