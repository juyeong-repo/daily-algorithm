/**
 * 2023.05.17
 * 49189. 가장 먼 노드
 * https://school.programmers.co.kr/learn/courses/30/lessons/49189
 *
 * Site: Programmers
 * Level: 3
 *
 * ================
 * Comment:
 * 다익스트라를 사용한 방법으로도 풀어보기
 * */
import java.util.*;
class Solution {
    public int solution(int n, int[][] edge) {
        int answer = 0;
        boolean visit[] = new boolean[n+1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        visit[1] = true;

        while (!queue.isEmpty()) {
            int size = queue.size();
            int count = 0;
            for (int s=0; s<size; s++) {
                int node = queue.poll();
                for (int i=0; i<edge.length; i++) {
                    if (edge[i][0] == node) {
                        int next = edge[i][1];
                        if (!visit[next]) {
                            queue.add(edge[i][1]);
                            count++;
                            visit[next] = true;
                        }
                    } else if (edge[i][1] == node) {
                        int next = edge[i][0];
                        if (!visit[next]) {
                            queue.add(edge[i][0]);
                            count++;
                            visit[next] = true;
                        }
                    }
                }
            }
            if (count != 0) {
                answer = count;
            }
        }

        return answer;
    }
}