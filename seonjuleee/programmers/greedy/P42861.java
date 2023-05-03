/**
 * 2023.05.04
 * 42861. 섬 연결하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/42861
 *
 * Site: Programmers
 * Level: 3
 * */

import java.util.*;
class Solution {

    public int findParent(int[] parent, int node) {
        if (parent[node] == node) return node;
        return findParent(parent, parent[node]);
    }

    public void union(int[] parent, int node1, int node2) {
        int parent1 = findParent(parent, node1);
        int parent2 = findParent(parent, node2);

        if (parent1 < parent2) parent[parent2] = parent1;
        else parent[parent1] = parent2;
    }

    public int solution(int n, int[][] costs) {
        int answer = 0;
        int parent[] = new int[n];

        // 부모 설정
        for (int i=0; i<parent.length; i++) {
            parent[i] = i;
        }

        // 건설 비용을 기준으로 오름차순 정렬
        Arrays.sort(costs, (a, b) -> {
            return a[2] - b[2];
        });

        for (int i=0; i<costs.length; i++) {
            // 각 노드의 부모가 일치하지 않으면 채택
            if (findParent(parent, costs[i][0]) != findParent(parent, costs[i][1])) {
                answer += costs[i][2];
                union(parent, costs[i][0], costs[i][1]);
            }
        }

        return answer;
    }
}