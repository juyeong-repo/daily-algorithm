/**
 * 2023.04.27
 * 42885. 구명보트
 * https://school.programmers.co.kr/learn/courses/30/lessons/42885
 *
 * Site: Programmers
 * Level: 2
 * */

import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int l = 0, r = people.length - 1;
        while (l <= r) {
            if (people[r] + people[l] <= limit) { // 두 명 같이 타는 경우
                l++; r--;
            } else { // 혼자 타는 경우
                r--;
            }
            answer++;
        }
        return answer;
    }
}