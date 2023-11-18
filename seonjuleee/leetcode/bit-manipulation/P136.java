/**
 * 2023.11.18
 * 136. Single Number
 * https://leetcode.com/problems/single-number
 *
 * Site: Leetcode
 * Level: Easy
 * */
import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        int answer = nums[0];
        for (int i=0; i<nums.length-1; i++) {
            answer = answer ^ nums[i+1];
        }
        return answer;
    }
}