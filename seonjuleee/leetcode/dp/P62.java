/**
 * 2023.06.26
 * 62. Unique Paths
 * https://leetcode.com/problems/unique-paths
 *
 * Site: Leetcode
 * Level: Medium
 * */
import java.util.*;
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] point = new int[m][n];
        for (int i=0; i<m; i++) {
            Arrays.fill(point[i], 1);
        }
        for (int i=1; i<m; i++) {
            for (int j=1; j<n; j++) {
                point[i][j] = point[i-1][j] + point[i][j-1];
            }
        }
        return point[m-1][n-1];
    }
}