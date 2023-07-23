/**
 * 2023.07.18
 * 167. Two Sum II - Input Array Is Sorted
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted
 *
 * Site: Leetcode
 * Level: Medium
 * */

class Solution {
    public int binarySearch(int[] numbers, int target, int left, int right, int exclusion) {
        if (left > right) return -1;

        int mid = (left + right) / 2;
        if (numbers[mid] == target && mid != exclusion) return mid;
        else if (numbers[mid] <= target) return binarySearch(numbers, target, mid+1, right, exclusion);
        else return binarySearch(numbers, target, left, mid-1, exclusion);
    }
    public int[] twoSum(int[] numbers, int target) {
        for (int i=0; i<numbers.length; i++) {
            int index = binarySearch(numbers, target - numbers[i], 0, numbers.length-1, i);
            if (index != -1) return new int[] {i+1, index+1};
        }

        return null;
    }
}