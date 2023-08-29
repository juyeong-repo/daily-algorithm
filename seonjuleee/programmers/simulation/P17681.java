/**
 * 2023.08.30
 * 17681. 비밀지도
 * https://school.programmers.co.kr/learn/courses/30/lessons/17681
 *
 * Site: Programmers
 * Level: 1
 * */

import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i=0; i<n; i++) {
            int merge = arr1[i] | arr2[i];
            StringBuilder sb = new StringBuilder();
            for (int j=0; j<n; j++) {
                int r = merge % 2;
                if (r == 0) {
                    sb.append(' ');
                } else {
                    sb.append('#');
                }
                merge /= 2;
            }
            answer[i] = sb.reverse().toString();
        }
        return answer;
    }
}