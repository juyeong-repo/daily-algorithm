/**
 * 2023.09.02
 * 695. Max Area of Island
 * https://leetcode.com/problems/max-area-of-island
 *
 * Site: Leetcode
 * Level: Medium
 * */

class Solution {
    public int m;
    public int n;
    public int[][] grid;
    public boolean[][] visit;
    public int answer = 0;

    public boolean isPossible(int x, int y) {
        if (x >= 0 && x < m && y >= 0 && y < n) return true;
        return false;
    }

    public int dfs(int x, int y, int area) {
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};

        for (int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (isPossible(nx, ny) && !visit[nx][ny]) {
                if (grid[nx][ny] == 1) {
                    visit[nx][ny] = true;
                    area = dfs(nx, ny, area+1);
                }
            }
        }

        return area;
    }

    public int maxAreaOfIsland(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        this.grid = grid;
        visit = new boolean[m][n];

        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[0].length; j++) {
                if (!visit[i][j] && grid[i][j] == 1) {
                    visit[i][j] = true;
                    int area = dfs(i, j, 1);
                    answer = Math.max(answer, area);
                }
            }
        }

        return answer;
    }
}