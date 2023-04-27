/**
 * 2023.04.28
 * 42883. 큰 수 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/42883
 *
 * Site: Programmers
 * Level: 2
 *
 * ================
 * Comment:
 * 스택을 사용한 방법으로도 풀어보기
 * */

import java.lang.StringBuilder;
class Solution {
    public int findIndexHavingMax(String str) {
        int max = -1, idx = -1;
        for (int i=0; i<str.length(); i++) {
            int n = Integer.valueOf(str.charAt(i));
            if (max < n) {
                max = n;
                idx = i;
            }
        }

        return idx;

    }

    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int len = number.length() - k;
        while (k > 0 && number.length() > 0
                && len != sb.length()) { // StringBuilder에 숫자가 다 채워졌을 때의 예외 처리
            String sub = number;
            if (k+1 < number.length()) {
                sub = number.substring(0, k+1);
            }
            // sub에서 가장 큰 수를 가지는 index 찾기
            int idx = findIndexHavingMax(sub);
            sb.append(number.charAt(idx));
            number = number.substring(idx+1);
            k -= idx;
        }

        if (sb.length() != len)
            sb.append(number);

        return sb.toString();
    }
}