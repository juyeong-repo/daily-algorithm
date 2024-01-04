/**
 * 2023.10.08
 * 17677. 뉴스 클러스터링
 * https://school.programmers.co.kr/learn/courses/30/lessons/17677
 *
 * Site: Programmers
 * Level: 2
 * */

import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;

        // 특수문자 제외 & 대소문자 구분 X
        str1 = str1.replaceAll("[^A-Za-z]", ".").toLowerCase();
        str2 = str2.replaceAll("[^A-Za-z]", ".").toLowerCase();

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        // 집합 만들기
        for (int i=0; i<str1.length()-1; i++) {
            String s = str1.substring(i, i+2);
            if (!s.contains(".")) {
                list1.add(s);
            }
        }
        for (int j=0; j<str2.length()-1; j++) {
            String s = str2.substring(j, j+2);
            if (!s.contains(".")) {
                list2.add(s);
            }
        }

        // 교집합과 합집합의 개수 세기
        int n1 = list1.size();
        int n2 = list2.size();

        int intersection = 0;
        for (int i=0; i<list1.size(); i++) {
            String s = list1.get(i);
            if (list2.contains(s)) {
                intersection++;
                list2.remove(s);
            }
        }

        int union = n1 + n2 - intersection;

        if (union == 0 && intersection == 0) return 65536;

        // 자카드 유사도 계산
        return intersection * 65536 / union;
    }
}