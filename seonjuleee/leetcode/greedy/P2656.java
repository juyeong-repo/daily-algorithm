/**
 * 2023.07.14
 * 2656. Maximum Sum With Exactly K Elements
 * https://leetcode.com/problems/maximum-sum-with-exactly-k-elements
 *
 * Site: Leetcode
 * Level: Easy
 * */

import java.util.*;
class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int max = nums[nums.length - 1];
        return max * k + (k * (k-1) / 2);
    }
}