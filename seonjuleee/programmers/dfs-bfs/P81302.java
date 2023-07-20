/**
 * 2023.07.21
 * 81302. 거리두기 확인하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/81302
 *
 * Site: Programmers
 * Level: 2
 * */
import java.util.*;
class Solution {
    public boolean bfs(int x, int y, String[] place, boolean[][] visited) {
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {x, y});

        while (!q.isEmpty()) {
            int[] p = q.poll();

            for (int i=0; i<4; i++) {
                int nx = p[0] + dx[i];
                int ny = p[1] + dy[i];

                if (isPossible(nx, ny) && !visited[nx][ny]) {
                    int distance = Math.abs(nx - x) + Math.abs(ny - y);
                    if (place[nx].charAt(ny) == 'P' && distance <= 2) {
                        return false;
                    } else if (place[nx].charAt(ny) == 'O' && distance < 2) {
                        visited[nx][ny] = true;
                        q.add(new int[] {nx, ny});
                    }
                }
            }
        }

        return true;
    }

    public boolean isPossible(int x, int y) {
        if (x >= 0 && x < 5 && y >= 0 && y < 5) return true;
        return false;
    }

    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];

        for (int i=0; i<places.length; i++) {
            String[] place = places[i];
            boolean ans = true;
            boolean[][] visited = new boolean[5][5];

            for (int x=0; x<5; x++) {
                for (int y=0; y<5; y++) {
                    if (place[x].charAt(y) == 'P') {
                        visited[x][y] = true;
                        if (!bfs(x, y, place, visited)) {
                            ans = false;
                        }
                    }
                }
            }
            answer[i] = ans ? 1 : 0;

        }


        return answer;
    }
}