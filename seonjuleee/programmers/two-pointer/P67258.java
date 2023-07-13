/**
 * 2023.06.04
 * 67258. 보석 쇼핑
 * https://school.programmers.co.kr/learn/courses/30/lessons/67258
 *
 * Site: Programmers
 * Level: 3
 * */

import java.util.*;
class Solution {
    public int[] solution(String[] gems) {
        Set<String> set = new HashSet<>(); // 보석 종류 파악
        Map<String, Integer> map = new HashMap<>(); // 보석의 종류 별 개수
        Queue<String> q = new LinkedList<>();

        for (String str : gems) {
            set.add(str);
        }

        int cnt = 0;
        int start = 0;
        int end = gems.length;
        int min = Integer.MAX_VALUE;

        for (String gem : gems) {
            q.add(gem);
            map.put(gem, map.getOrDefault(gem, 0) + 1); // 중복값은 +1

            while(true) {
                String peek = q.peek();

                if (map.get(peek) > 1) { // 2개 이상일 경우
                    q.poll();
                    map.put(peek, map.getOrDefault(peek, 0) - 1);
                    cnt++;
                } else {
                    break;
                }
            }

            if (map.size() == set.size() && min > q.size()) {
                min = q.size();
                start = cnt;
            }
        }

        int[] answer = {start+1, start+min};

        return answer;
    }
}