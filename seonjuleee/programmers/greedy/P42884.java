/**
 * 2023.05.02
 * 42884. 단속카메라
 * https://school.programmers.co.kr/learn/courses/30/lessons/42884
 *
 * Site: Programmers
 * Level: 3
 * */
import java.util.*;
class Solution {
    public int solution(int[][] routes) {
        int answer = 0;

        // 진출 지점을 기준으로 오름차순 정렬
        Arrays.sort(routes, (a, b) -> {return a[1] - b[1];});

        int camera = -30001;
        // 진입 지점보다 작은지 확인
        for (int i=0; i<routes.length; i++) {
            if (camera < routes[i][0]) {
                answer++;
                camera = routes[i][1];
            }
        }

        return answer;
    }
}