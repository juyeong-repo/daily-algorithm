/**
 * 2023.06.01
 * 12980. 점프와 순간 이동
 * https://school.programmers.co.kr/learn/courses/30/lessons/12980
 *
 * Site: Programmers
 * Level: 2
 * */

import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        while (n != 0) {
            if (n % 2 == 1) {
                answer++;
            }
            n /= 2;
        }
        return answer;
    }
}