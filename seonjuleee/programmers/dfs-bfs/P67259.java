/**
 * 2023.07.12
 * 67259. 경주로 건설
 * https://school.programmers.co.kr/learn/courses/30/lessons/67259
 *
 * Site: Programmers
 * Level: 3
 * */

import java.util.*;
class Solution {
    public int N;
    public class Point {
        public int x;
        public int y;
        public int dir;
        public int cost;

        public Point(int x, int y, int dir, int cost) {
            this.x = x;
            this.y = y;
            this.dir = dir;
            this.cost = cost;
        }
    }

    public boolean isPossible(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;
        return false;
    }

    public int solution(int[][] board) {
        int answer = Integer.MAX_VALUE;
        N = board.length;
        Queue<Point> queue = new LinkedList<>();

        int[] dx = {0, 1, -1, 0};
        int[] dy = {1, 0, 0, -1};

        boolean[][][] visit = new boolean[N][N][4];
        queue.add(new Point(0,0,-1,0));

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i=0; i<size; i++) {
                Point p = queue.poll();
                if (p.x == N - 1 && p.y == N - 1) {
                    answer = Math.min(answer, p.cost);
                }
                for (int j=0; j<4; j++) {
                    int nx = p.x + dx[j];
                    int ny = p.y + dy[j];

                    if (isPossible(nx, ny) && board[nx][ny] != 1) {

                        // 비용 계산
                        int nc = p.cost;
                        if (p.dir == -1 || p.dir == j) { // 직선 도로
                            nc += 100;
                        } else { // 곡선 도로
                            nc += 600;
                        }

                        if (!visit[nx][ny][j] || board[nx][ny] >= nc) {
                            visit[nx][ny][j] = true;
                            queue.add(new Point(nx, ny, j, nc));
                            board[nx][ny] = nc;
                        }
                    }
                }
            }
        }

        return answer;
    }
}