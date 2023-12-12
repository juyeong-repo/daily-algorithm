/**
 * 2023.12.13
 * 17686. 파일명 정렬
 * https://school.programmers.co.kr/learn/courses/30/lessons/17686
 *
 * Site: Programmers
 * Level: 2
 * */

import java.util.*;

class Solution {
    public String[] solution(String[] files) {
        String[] answer = new String[files.length];
        String[][] sliceFiles = new String[files.length][3];

        // 문자 별로 h, n, t 자르기
        for (int i=0; i<files.length; i++) {
            String file = files[i];
            int start = -1;
            for (int j=0; j<file.length(); j++) {
                char c = file.charAt(j);
                if (c - '0' >= 0 && c - '0' < 10) { // 숫자이면
                    start = j;
                    break;
                }
            }

            int end = -1;
            for (int j=start; j<file.length(); j++) {
                char c = file.charAt(j);
                if (c - '0' >= 0 && c - '0' < 10) { // 숫자이면
                    end = j;
                } else {
                    break;
                }
            }
            if (end - start >= 5) {
                end = start + 4;
            }

            sliceFiles[i][0] = file.substring(0, start);
            sliceFiles[i][1] = file.substring(start, end+1);
            sliceFiles[i][2] = file.substring(end+1);
        }

        Arrays.sort(sliceFiles, (a, b) -> {
            if (a[0].toLowerCase().equals(b[0].toLowerCase())) {
                int n1 = Integer.valueOf(a[1]);
                int n2 = Integer.valueOf(b[1]);
                if (n1 == n2) {
                    return 0;
                } else {
                    return n1 - n2;
                }
            } else {
                return a[0].toLowerCase().compareTo(b[0].toLowerCase());
            }
        });

        for (int i=0; i<sliceFiles.length; i++) {
            answer[i] = sliceFiles[i][0] + sliceFiles[i][1] + sliceFiles[i][2];
        }

        return answer;
    }
}