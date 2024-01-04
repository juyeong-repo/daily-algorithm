/**
 * 2023.12.15
 * 17679. 프렌즈4블록
 * https://school.programmers.co.kr/learn/courses/30/lessons/17679
 *
 * Site: Programmers
 * Level: 2
 * */
class Solution {
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        String[] b = new String[n];

        // String으로 편하게 지우기 위해 board 재구성
        for (int i=0; i<n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j=m-1; j>=0; j--) {
                sb.append(board[j].charAt(i));
            }
            b[i] = sb.toString();
        }

        while (true) {
            boolean[][] check = new boolean[n][m];

            int cnt = 0;
            // 4블록 있는지 판단 -> check에 표시
            for (int i=0; i<n-1; i++) {
                for (int j=0; j<b[i].length()-1 && j<b[i+1].length()-1; j++) {
                    char c = b[i].charAt(j);
                    if (c == b[i+1].charAt(j) && c == b[i].charAt(j+1) && c == b[i+1].charAt(j+1)) {
                        check[i][j] = true;
                        check[i+1][j] = true;
                        check[i][j+1] = true;
                        check[i+1][j+1] = true;
                        cnt++;
                    }
                }
            }

            if (cnt == 0) break; // 지워질 블록이 없다면 끝내기

            // check에 true인 문자 없애고 밀기
            for (int i=0; i<n; i++) {
                char[] toChar = b[i].toCharArray();
                for (int j=0; j<b[i].length(); j++) {
                    if (check[i][j]) {
                        toChar[j] = '.';
                        answer++;
                    }
                }
                b[i] = String.valueOf(toChar).replace(".", "");
            }
        }

        return answer;
    }
}