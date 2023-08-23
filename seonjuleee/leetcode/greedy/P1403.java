/**
 * 2023.08.24
 * 1403. Minimum Subsequence in Non-Increasing Order
 * https://leetcode.com/problems/minimum-subsequence-in-non-increasing-order
 *
 * Site: Leetcode
 * Level: Easy
 * */
import java.util.*;
class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }

        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();

        int sumSubseq = 0;
        for (int i=nums.length-1; i>=0; i--) {
            list.add(nums[i]);
            sum -= nums[i];
            sumSubseq += nums[i];
            if (sum < sumSubseq) {
                return list;
            }
        }

        return list;
    }
}