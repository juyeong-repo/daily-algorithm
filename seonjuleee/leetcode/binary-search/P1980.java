/**
 * 2023.08.17
 * 1980. Find Unique Binary String
 * https://leetcode.com/problems/find-unique-binary-string
 *
 * Site: Leetcode
 * Level: Medium
 * */
import java.util.*;
class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = (int) Math.pow(2, nums[0].length());
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<nums.length; i++) {
            list.add(Integer.parseInt(nums[i], 2));
        }
        Collections.sort(list);
        for (int k=0; k<n; k++) {
            if (list.size() <= k || k != list.get(k)) {
                return Integer.toBinaryString(0x10000 | k).substring(17 - nums[0].length());
            }
        }

        return "";
    }
}