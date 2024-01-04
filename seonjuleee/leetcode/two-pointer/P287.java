/**
 * 2023.11.17
 * 287. Find the Duplicate Number
 * https://leetcode.com/problems/find-the-duplicate-number
 *
 * Site: Leetcode
 * Level: Medium
 * */
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i=0; i<nums.length-1; i++) {
            if (nums[i] == nums[i+1]) return nums[i];
        }
        return 0;
    }
}