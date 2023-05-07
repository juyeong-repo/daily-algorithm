
/**
 * 2023.05.08
 * 350. Intersection of Two Arrays II
 * https://leetcode.com/problems/intersection-of-two-arrays-ii
 *
 * Site: Leetcode
 * Level: Easy
 * */

class Solution {
    public int[] twoPointers(int[] smallArr, int[] largeArr) {
        List<Integer> list = new ArrayList<>();

        int i=0; int j=0;
        while (i<smallArr.length && j<largeArr.length) {
            if (smallArr[i] == largeArr[j]) {
                list.add(smallArr[i++]);
                j++;
            } else if (smallArr[i] < largeArr[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] res = new int[list.size()];
        for (int l = 0; l < list.size(); l++) {
            res[l] = list.get(l);
        }

        return res;
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        if (nums1.length < nums2.length) {
            return twoPointers(nums1, nums2);
        } else {
            return twoPointers(nums2, nums1);
        }
    }
}