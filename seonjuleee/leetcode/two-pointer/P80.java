/**
 * 2023.10.16
 * 80. Remove Duplicates from Sorted Array II
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii
 *
 * Site: Leetcode
 * Level: Medium
 * */

class Solution {
    public int removeDuplicates(int[] nums) {

        int left = 1;
        int right = nums.length - 1;

        int amount = 1;
        int pre = nums[0];
        while (left <= right) {
            if (nums[left] == pre) {
                if (amount >= 2) {
                    // 맨 뒤로 보내기
                    for (int i=left; i<nums.length-1; i++) {
                        int temp = nums[i];
                        nums[i] = nums[i+1];
                        nums[i+1] = temp;
                    }
                    right--;
                } else {
                    left++;
                    amount++;
                }
            } else {
                pre = nums[left++];
                amount = 1;
            }
        }
        return right+1;
    }
}