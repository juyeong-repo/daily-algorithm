/**
 * 2023.06.01
 * 12981. 영어 끝말잇기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12981
 *
 * Site: Programmers
 * Level: 2
 * */

import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        List<String> list = new ArrayList<>();
        list.add(words[0]);

        for (int i=1; i<words.length; i++) {
            // 1) 이전에 등장했던 단어인지
            // 2) 전 단어의 마지막 문자로 시작하는지
            String str = list.get(i-1);
            String last = str.substring(str.length() - 1);
            String start = words[i].substring(0, 1);
            if (list.contains(words[i]) || !last.equals(start)) {
                System.out.println(i);
                return new int[] {i % n + 1, i / n + 1};
            }

            list.add(words[i]);
        }

        return new int[] {0,0};
    }
}