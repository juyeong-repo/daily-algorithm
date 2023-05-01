/**
 * 2023.05.01
 * 43165. 조이스틱
 * https://school.programmers.co.kr/learn/courses/30/lessons/42860
 *
 * Site: Programmers
 * Level: 2
 * */
class Solution {
    public int solution(String name) {
        int answer = 0;
        int len = name.length();
        int idx = 0;
        int move = len - 1; // 좌우 움직임 수

        for (int i=0; i<len; i++) {
            int temp = name.charAt(i) - 'A';
            answer += Math.min(temp, 26 - temp);

            // 연속되는 A의 개수를 확인
            idx = i+1;
            while (idx < len && name.charAt(idx) == 'A') {
                idx++;
            }

            // 순서대로 가는 것과 뒤로 돌아가는 것 중 이동수 적은 것 선택
            move = Math.min(move, i * 2 + len - idx);
            move = Math.min(move, (len - idx) * 2 + i);
        }

        return answer + move;
    }
}