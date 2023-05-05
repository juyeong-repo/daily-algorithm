/**
 * 2023.05.05
 * 43105. 정수 삼각형
 * https://school.programmers.co.kr/learn/courses/30/lessons/43105
 *
 * Site: Programmers
 * Level: 3
 *
 * ================
 * Description:
 * https://devseon.tistory.com/entry/Programmers-43105-%EC%A0%95%EC%88%98-%EC%82%BC%EA%B0%81%ED%98%95
 * */

class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        int[] memo = new int[1];

        for (int i=0; i<triangle.length; i++) {
            int[] tmp = new int[i+2];
            tmp[0] = memo[0] + triangle[i][0]; // 배열의 첫 번째 값 설정

            for (int j=1; j<=i; j++) {
                tmp[j] = Math.max(memo[j-1], memo[j]) + triangle[i][j];
            }

            tmp[i+1] = 0; // 배열 끝에 0을 추가
            memo = tmp;
        }

        for (int m : memo) {
            answer = Math.max(answer, m);
        }
        return answer;
    }
}