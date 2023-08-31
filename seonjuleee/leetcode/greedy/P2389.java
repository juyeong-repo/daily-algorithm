/**
 * 2023.07.25
 * 2389. Longest Subsequence With Limited Sum
 * https://leetcode.com/problems/longest-subsequence-with-limited-sum
 *
 * Site: Leetcode
 * Level: Easy
 * */
import java.util.*;
class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] answer = new int[queries.length];
        Arrays.sort(nums);
        for (int i=0; i<queries.length; i++) {
            int sum = 0;
            for (int j=0; j<nums.length; j++) {
                sum += nums[j];
                if (sum > queries[i]) {
                    break;
                }
                answer[i] = j+1;
            }
        }
        return answer;
    }
}