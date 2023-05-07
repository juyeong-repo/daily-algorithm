/**
 * 2023.05.07
 * 42895. N으로 표현
 * https://school.programmers.co.kr/learn/courses/30/lessons/42895
 *
 * Site: Programmers
 * Level: 3
 *
 * ================
 * Comment:
 * DFS 방법으로도 풀어보기
 * */

import java.util.*;
class Solution {
    public void union(Set<Integer> set, Set<Integer> s1, Set<Integer> s2) {
        for (int i1 : s1) {
            for (int i2 : s2) {
                set.add(i1 + i2);
                set.add(i1 - i2);
                set.add(i1 * i2);
                if (i2 != 0) set.add(i1 / i2);
            }
        }
    }

    public int solution(int N, int number) {
        int answer = 1;
        if (N == number) return 1;
        Set<Integer>[] setArr = new Set[9]; // 최솟값이 8보다 크면 -1 리턴
        int num = N; // 연속된 수 (ex. 5, 55, 555) 미리 저장
        for (int i=1; i<9; i++) {
            setArr[i] = new HashSet<>();
            setArr[i].add(num);
            num = num * 10 + N;
        }
        setArr[1].add(N);

        for (int i=2; i<9; i++) {
            for (int j=1; j<=i/2; j++) {
                union(setArr[i], setArr[i-j], setArr[j]);
                union(setArr[i], setArr[j], setArr[i-j]);
            }

            // number를 표현 가능하면 멈추고 리턴
            if (setArr[i].contains(number)) {
                return i;
            }
        }

        return -1;
    }
}