/**
 * 2023.05.18
 * 743. Network Delay Time
 * https://leetcode.com/problems/network-delay-time
 *
 * Site: Leetcode
 * Level: Medium
 * */

import java.util.*;
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int[] dist = new int[n+1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        boolean[] visit = new boolean[n+1];
        Queue<Integer> q = new LinkedList<>();

        // init
        dist[k] = 0; visit[k] = true;
        q.add(k);

        while (!q.isEmpty()) {
            int node = q.poll();
            for (int j=0; j<times.length; j++) {
                if (times[j][0] == node) {
                    int next = times[j][1];
                    if (dist[next] > dist[node] + times[j][2]) {
                        q.add(next);
                        visit[next] = true;
                        dist[next] = dist[node] + times[j][2];
                    }
                }
            }
        }

        int answer = 0;
        for (int i=1; i<=n; i++) {
            if (dist[i] == Integer.MAX_VALUE) return -1;
            answer = Math.max(answer, dist[i]);
        }

        return answer;
    }
}