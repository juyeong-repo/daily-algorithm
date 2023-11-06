/**
 * 2023.11.07
 * 11. Container With Most Water
 * https://leetcode.com/problems/container-with-most-water
 *
 * Site: Leetcode
 * Level: Medium
 * */
class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int max = 0;
        int left = 0; int right = n - 1;
        while (left < right) {
            int amount = (right - left) * Math.min(height[left], height[right]);
            max = Math.max(max, amount);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}