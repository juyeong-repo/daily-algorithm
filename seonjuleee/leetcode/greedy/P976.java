/**
 * 2023.07.20
 * 976. Largest Perimeter Triangle
 * https://leetcode.com/problems/largest-perimeter-triangle
 *
 * Site: Leetcode
 * Level: Easy
 * */
import java.util.*;
class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i=nums.length-1; i>=2; i--) {
            if (nums[i-1]+nums[i-2] > nums[i]) return nums[i]+nums[i-1]+nums[i-2];
        }
        return 0;
    }
}