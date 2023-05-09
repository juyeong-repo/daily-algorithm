/**
 * 2023.05.09
 * 200. Number of Islands
 * https://leetcode.com/problems/number-of-islands
 *
 * Site: Leetcode
 * Level: Medium
 * */

import java.util.*;
class Solution {

    public class Point {
        int x;
        int y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int numIslands(char[][] grid) {
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        int answer = 0;

        boolean[][] isVisit = new boolean[grid.length][grid[0].length];
        Queue<Point> queue = new LinkedList<>();

        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[0].length; j++) {
                if (!isVisit[i][j] && grid[i][j] == '1') {
                    isVisit[i][j] = true;
                    queue.add(new Point(i, j));

                    while (!queue.isEmpty()) {
                        Point p = queue.poll();
                        for (int k=0; k<4; k++) {
                            int nx = p.x + dx[k];
                            int ny = p.y + dy[k];

                            if (nx >= 0 && nx < grid.length && ny >= 0 && ny < grid[0].length) {
                                if (!isVisit[nx][ny] && grid[nx][ny] == '1') {
                                    isVisit[nx][ny] = true;
                                    queue.add(new Point(nx, ny));
                                }
                            }
                        }
                    }
                    answer++;
                }
            }
        }
        return answer;

    }
}