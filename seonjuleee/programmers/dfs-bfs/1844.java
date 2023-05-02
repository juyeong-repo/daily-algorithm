/**
 * 2023.05.03
 * 1844. 게임 맵 최단거리
 * https://school.programmers.co.kr/learn/courses/30/lessons/1844
 *
 * Site: Programmers
 * Level: 2
 * */

import java.util.*;
class Solution {
    public int[] dx = {0, 0, 1, -1};
    public int[] dy = {1, -1, 0, 0};
    public boolean[][] isVisit;
    public int answer;

    public boolean isPossible(int x, int y, int xLen, int yLen) {
        if (x >= 0 && x < xLen && y >= 0 && y < yLen) return true;
        return false;
    }

    public class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int solution(int[][] maps) {
        answer = 0;
        isVisit = new boolean[maps.length][maps[0].length];

        Queue<Point> q = new LinkedList<>();

        isVisit[0][0] = true;
        q.add(new Point(0,0));

        while (!q.isEmpty()) {
            answer++;
            int size = q.size();

            for (int k=0; k<size; k++) {
                Point p = q.poll();
                if (p.x == maps.length-1 && p.y == maps[0].length-1) {
                    return answer;
                }

                for (int i=0; i<4; i++) {
                    int nx = p.x + dx[i];
                    int ny = p.y + dy[i];
                    if (isPossible(nx, ny, maps.length, maps[0].length)) {
                        if (!isVisit[nx][ny] && maps[nx][ny] == 1) {
                            isVisit[nx][ny] = true;
                            q.add(new Point(nx, ny));
                        }
                    }
                }
            }
        }

        return -1;
    }
}