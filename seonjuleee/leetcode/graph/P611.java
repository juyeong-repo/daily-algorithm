/**
 * 2023.11.28
 * 611. Valid Triangle Number
 * https://leetcode.com/problems/find-the-town-judge
 *
 * Site: Leetcode
 * Level: Easy
 * */

class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] count = new int[n+1];
        for (int i=0; i<trust.length; i++) {
            count[trust[i][1]]++;
        }

        int judge = -1;
        for (int i=1; i<=n; i++) {
            if (count[i] == n-1) {
                judge = i;
                break;
            }
        }

        for (int i=0; i<trust.length; i++) {
            if (trust[i][0] == judge) {
                return -1;
            }
        }
        return judge;
    }
}