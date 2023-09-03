/**
 * 2023.09.03
 * 17680. 캐시
 * https://school.programmers.co.kr/learn/courses/30/lessons/17680
 *
 * Site: Programmers
 * Level: 2
 * */

import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Queue<String> queue = new LinkedList<>();
        if (cacheSize == 0) return cities.length * 5;
        for (int i=0; i<cities.length; i++) {
            if (queue.contains(cities[i].toLowerCase())) {
                queue.remove(cities[i].toLowerCase());
                queue.add(cities[i].toLowerCase());
                answer += 1;
            } else {
                if (queue.size() >= cacheSize) {
                    queue.poll();
                }
                queue.add(cities[i].toLowerCase());
                answer += 5;
            }
        }
        return answer;
    }
}