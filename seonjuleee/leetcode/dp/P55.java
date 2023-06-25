/**
 * 2023.06.21
 * 55. Jump Game
 * https://leetcode.com/problems/jump-game
 *
 * Site: Leetcode
 * Level: Medium
 * */
class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int k = n - 2;
        int answer = n - 1;
        while (k >= 0) {
            if (k + nums[k] >= answer) {
                answer = k;
            }
            k--;
        }
        return answer == 0 ? true : false;
    }
}