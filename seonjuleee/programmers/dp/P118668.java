/**
 * 2023.07.03
 * 118668. 코딩 테스트 공부
 * https://school.programmers.co.kr/learn/courses/30/lessons/118668
 *
 * Site: Programmers
 * Level: 3
 * */

class Solution {
    public int solution(int alp, int cop, int[][] problems) {
        int answer = 0;
        int maxAlp = 0; int maxCop = 0;

        for (int[] p : problems) {
            maxAlp = Math.max(p[0], maxAlp);
            maxCop = Math.max(p[1], maxCop);
        }

        if (alp >= maxAlp && cop >= maxCop) {
            return 0;
        }

        if (alp >= maxAlp) alp = maxAlp;
        if (cop >= maxCop) cop = maxCop;

        int[][] dp = new int[maxAlp + 2][maxCop + 2];
        for (int i=alp; i<=maxAlp; i++) {
            for (int j=cop; j<=maxCop; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }

        dp[alp][cop] = 0;
        for (int i=alp; i<=maxAlp; i++) {
            for (int j=cop; j<=maxCop; j++) {
                // 공부
                dp[i+1][j] = Math.min(dp[i+1][j], dp[i][j]+1);
                dp[i][j+1] = Math.min(dp[i][j+1], dp[i][j]+1);

                for (int m=0; m<problems.length; m++) {
                    // 현재 알고력과 코딩력이 문제를 해결할 수 있는 조건을 넘었을 경우
                    if (i >= problems[m][0] && j >= problems[m][1]) {
                        // 알고력과 코딩력이 목표치를 넘었을 경우
                        if (i+problems[m][2] > maxAlp && j+problems[m][3] > maxCop) {
                            dp[maxAlp][maxCop] = Math.min(dp[maxAlp][maxCop], dp[i][j] + problems[m][4]);
                        }
                        // 알고력이 목표치를 넘겼을 경우
                        else if (i+problems[m][2] > maxAlp) {
                            dp[maxAlp][j+problems[m][3]] = Math.min(dp[maxAlp][j+problems[m][3]], dp[i][j] + problems[m][4]);
                        }
                        // 코딩력이 목표치를 넘겼을 경우
                        else if (j+problems[m][3] > maxCop) {
                            dp[i+problems[m][2]][maxCop] = Math.min(dp[i+problems[m][2]][maxCop], dp[i][j] + problems[m][4]);
                        }
                        // 목표치에 도달하지 못한 경우
                        else if (i+problems[m][2] <= maxAlp && j+problems[m][3] <= maxCop) {
                            dp[i+problems[m][2]][j+problems[m][3]] = Math.min(dp[i+problems[m][2]][j+problems[m][3]], dp[i][j]+problems[m][4]);
                        }
                    }

                }
            }
        }

        answer = dp[maxAlp][maxCop];

        return answer;
    }
}