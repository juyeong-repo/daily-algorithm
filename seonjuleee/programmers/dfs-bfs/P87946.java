/**
 * 2023.05.29
 * 87946. 피로도
 * https://school.programmers.co.kr/learn/courses/30/lessons/87946
 *
 * Site: Programmers
 * Level: 2
 * */
import java.util.*;
class Solution {
    public int dfs(int k, int[][] dungeons, boolean[] visit, int count) {
        int ans = count;
        for (int i=0; i<dungeons.length; i++) {
            if (k >= dungeons[i][0] && !visit[i]) {
                visit[i] = true;
                ans = Math.max(dfs(k - dungeons[i][1], dungeons, visit, count+1), ans);
                visit[i] = false;
            }
        }
        return ans;
    }

    public int solution(int k, int[][] dungeons) {
        boolean[] visit = new boolean[dungeons.length];
        return dfs(k, dungeons, visit, 0);
    }
}