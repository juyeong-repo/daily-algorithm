/**
 * 2023.06.07
 * 1005. Maximize Sum Of Array After K Negations
 * https://leetcode.com/problems/maximize-sum-of-array-after-k-negations
 *
 * Site: Leetcode
 * Level: Easy
 * */

import java.util.*;
class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        for (int n : nums) {
            list.add(n);
        }

        while (k > 0) {
            Collections.sort(list);
            list.set(0, list.get(0) * -1);
            k--;
        }

        int sum = 0;
        for (int n : list) {
            sum += n;
        }

        return sum;
    }
}