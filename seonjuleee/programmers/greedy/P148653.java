/**
 * 2023.05.28
 * 148653. 마법의 엘리베이터
 * https://school.programmers.co.kr/learn/courses/30/lessons/148653
 *
 * Site: Programmers
 * Level: 3
 *
 * ================
 * Comment:
 * DFS 방법으로도 풀어보기
 * */

class Solution {
    public int solution(int storey) {
        int answer = 0;

        while (storey != 0) {
            int tmp = storey % 10;
            storey /= 10;
            if (tmp > 5) {
                answer += 10 - tmp;
                storey++;
            } else if (tmp == 5 && (storey % 10) >= 5) {
                answer += 10 - tmp;
                storey++;
            } else {
                answer += tmp;
            }
        }

        return answer;
    }
}