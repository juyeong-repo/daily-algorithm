/**
 * 2023.06.30
 * 1884. Egg Drop With 2 Eggs and N Floors
 * https://leetcode.com/problems/egg-drop-with-2-eggs-and-n-floors
 *
 * Site: Leetcode
 * Level: Medium
 * */
class Solution {
    public int twoEggDrop(int n) {
        int floors = n;
        int eggs = 2;
        int[] dp = new int[eggs+1];
        int moves = 0;
        for (moves = 0; dp[eggs] < floors; moves++) {
            for (int i=eggs; i>0; i--) {
                dp[i] += dp[i-1] + 1;
            }
        }
        return moves;
    }
}