/**
 * 2024.01.05
 * 17678. 셔틀버스
 * https://school.programmers.co.kr/learn/courses/30/lessons/17678
 *
 * Site: Programmers
 * Level: 3
 * */

import java.util.*;
class Solution {
    public String solution(int n, int t, int m, String[] timetable) {
        String answer = "";

        // 1. 리스트를 09:00 기준으로 한 분으로 변경
        int[] timeArr = new int[timetable.length];
        for (int i=0; i<timeArr.length; i++) {
            String time = timetable[i];
            int hour = Integer.valueOf(time.substring(0, 2));
            int min = Integer.valueOf(time.substring(3, 5));
            timeArr[i] = (hour - 9) * 60 + min;
        }
        Arrays.sort(timeArr);

        // 2. 마지막 셔틀을 제일 마지막에 타는 사람의 시간 구하기
        int corn = 0;
        int idx = 0; // 제일 앞에 있는 크루

        for (int i=1; i<=n; i++) {
            int mIdx = 0;
            for (int j=idx; j<timeArr.length; ++j) {
                if (timeArr[j] > (i-1) * t) { // 버스 시간
                    break;
                }
                mIdx++;
                idx++;
                if (mIdx == m) break;
            }
            if (i == n) { // 마지막 버스일 때
                if (mIdx == m) { // 콘의 자리가 없을 때
                    corn = timeArr[idx-1]-1;
                } else {
                    corn = (i-1) * t;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        corn += 540;
        int ansH = corn / 60;
        int ansM = corn % 60;
        if (ansH < 10) sb.append('0');
        sb.append(ansH);
        sb.append(':');
        if (ansM < 10) sb.append('0');
        sb.append(ansM);

        return sb.toString();
    }
}