/**
 * 2023.05.06
 * 42898. 등굣길
 * https://school.programmers.co.kr/learn/courses/30/lessons/42898
 *
 * Site: Programmers
 * Level: 3
 * */

class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int[][] ways = new int[m+1][n+1]; // 갈 수 있는 경로의 개수
        ways[1][1] = 1; // 초기값 설정

        // 물 위치 표시
        for (int i=0; i<puddles.length; i++) {
            ways[puddles[i][0]][puddles[i][1]] = -1;
        }

        for(int i=1; i<=m; i++) {
            for (int j=1; j<=n; j++) {
                if (ways[i][j] == -1) continue; // 물 위치 skip
                int left = ways[i-1][j] == -1 ? 0 : ways[i-1][j];
                int up = ways[i][j-1] == -1 ? 0 : ways[i][j-1];
                ways[i][j] += (left + up) % 1000000007;
            }
        }

        return ways[m][n];
    }
}