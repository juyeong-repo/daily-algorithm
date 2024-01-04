/**
 * 2023.10.26
 * 905. Sort Array By Parity
 * https://leetcode.com/problems/sort-array-by-parity
 *
 * Site: Leetcode
 * Level: Easy
 * */

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            if (nums[l] % 2 == 1) {
                if (nums[r] % 2 == 0) {
                    // swap
                    int tmp = nums[l];
                    nums[l] = nums[r];
                    nums[r] = tmp;
                    l++;
                } else {
                    r--;
                }
            } else {
                l++;
            }
        }
        return nums;
    }
}