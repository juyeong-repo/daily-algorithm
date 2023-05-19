/**
 * 2023.05.19
 * 1976. Number of Ways to Arrive at Destination
 * https://leetcode.com/problems/number-of-ways-to-arrive-at-destination
 *
 * Site: Leetcode
 * Level: Medium
 * */

import java.util.*;
class Solution {
    public int countPaths(int n, int[][] roads) {
        int p = 1000000007;
        List<int[]>[] adj = new List[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int[] road : roads) {
            adj[road[0]].add(new int[]{road[1], road[2]});
            adj[road[1]].add(new int[]{road[0], road[2]});
        }

        long[] minTime = new long[n];
        Arrays.fill(minTime, Long.MAX_VALUE);
        minTime[0] = 0;
        long[] numberOfWays = new long[n];
        numberOfWays[0] = 1;

        PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(x -> x[0]));
        pq.add(new long[]{0, 0});
        while (!pq.isEmpty()) {
            long[] poll = pq.poll();
            int node = (int) poll[1];
            long time = poll[0], ways = numberOfWays[node];
            if (minTime[node] != time) continue;
            for (int[] road : adj[node]) {
                int nextNode = road[0], roadTime = road[1];
                long nextTime = time + roadTime;
                if (nextTime < minTime[nextNode]) {
                    numberOfWays[nextNode] = ways;
                    minTime[nextNode] = nextTime;
                    pq.add(new long[]{nextTime, nextNode});
                } else if (nextTime == minTime[nextNode]) {
                    numberOfWays[nextNode] += ways;
                    if (numberOfWays[nextNode] >= p) numberOfWays[nextNode] -= p;
                }
            }
        }
        return (int) numberOfWays[n - 1];
    }
}