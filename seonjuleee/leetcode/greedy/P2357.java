/**
 * 2023.07.09
 * 2357. Make Array Zero by Subtracting Equal Amounts
 * https://leetcode.com/problems/make-array-zero-by-subtracting-equal-amounts
 *
 * Site: Leetcode
 * Level: Easy
 * */

import java.util.*;
class Solution {
    public int minimumOperations(int[] nums) {
        int answer = 0;
        Arrays.sort(nums);

        if (nums[0] != 0) answer++;
        for (int i=1; i<nums.length; i++) {
            if (nums[i-1] != nums[i]) answer++;
        }

        return answer;
    }
}