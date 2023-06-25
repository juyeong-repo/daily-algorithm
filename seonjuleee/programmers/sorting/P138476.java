/**
 * 2023.06.24
 * 138476. 귤 고르기
 * https://school.programmers.co.kr/learn/courses/30/lessons/138476
 *
 * Site: Programmers
 * Level: 2
 * */

import java.util.*;
class Solution {

    public int solution(int k, int[] tangerine) {
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int t : tangerine) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(map.keySet());

        list.sort((o1, o2) -> map.get(o2) - map.get(o1));

        int i = 0;
        while (k > 0) {
            k -= map.get(list.get(i));
            answer++;
            i++;
        }

        return answer;
    }
}