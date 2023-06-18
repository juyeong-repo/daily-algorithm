/**
 * 2023.06.18
 * 215. Kth Largest Element in an Array
 * https://leetcode.com/problems/kth-largest-element-in-an-array
 *
 * Site: Leetcode
 * Level: Medium
 * */
import java.util.*;
class Solution {
    public int findKthLargest(int[] nums, int k) {
        List<Integer> list = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toList());

        Collections.sort(list);

        return list.get(list.size() - k);
    }
}