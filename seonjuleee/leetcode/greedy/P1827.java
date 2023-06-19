/**
 * 2023.06.18
 * 1827. Minimum Operations to Make the Array Increasing
 * https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing
 *
 * Site: Leetcode
 * Level: Easy
 * */
class Solution {
    public int minOperations(int[] nums) {
        int answer = 0;
        for (int i=1; i<nums.length; i++) {
            if (nums[i-1] >= nums[i]) {
                answer += nums[i-1] + 1 - nums[i];
                nums[i] = nums[i-1] + 1;
            }
        }
        return answer;
    }
}