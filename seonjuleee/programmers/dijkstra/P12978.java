/**
 * 2023.05.13
 * 12978. 배달
 * https://school.programmers.co.kr/learn/courses/30/lessons/12978
 *
 * Site: Programmers
 * Level: 2
 * */

import java.util.*;

class Element implements Comparable<Element> {
    public int cost;
    public int here;

    public Element(int cost, int here) {
        this.cost = cost;
        this.here = here;
    }

    public int compareTo(Element o) {
        return cost <= o.cost ? -1 : 1;
    }
}

class Solution {

    public int[] dijkstra(int N, int[][] road, int start) {
        int[] dist = new int[N+1];
        Arrays.fill(dist, 500001);
        dist[start] = 0;

        PriorityQueue<Element> q = new PriorityQueue<>();
        q.add(new Element(0, start));

        int cost, here;
        int cost2, there;

        while (!q.isEmpty()) {
            cost = q.peek().cost;
            here = q.peek().here;
            q.poll();
            if (cost > dist[here]) continue;
            for (int i=0; i<road.length; i++) {
                if (road[i][0] == here) {
                    cost2 = road[i][2] + cost;
                    there = road[i][1];
                    // 최소 비용으로 교체
                    if (cost2 < dist[there]) {
                        dist[there] = cost2;
                        q.add(new Element(cost2, there));
                    }
                } else if (road[i][1] == here) {
                    cost2 = road[i][2] + cost;
                    there = road[i][0];
                    // 최소 비용으로 교체
                    if (cost2 < dist[there]) {
                        dist[there] = cost2;
                        q.add(new Element(cost2, there));
                    }
                }
            }
        }
        return dist;
    }
    public int solution(int N, int[][] road, int K) {
        int answer = 0;

        int[] dist = dijkstra(N, road, 1);
        for (int d : dist) {
            if (d <= K) answer++;
        }

        return answer;
    }
}