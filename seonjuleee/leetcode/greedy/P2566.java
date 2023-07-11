/**
 * 2023.07.11
 * 2566. Maximum Difference by Remapping a Digit
 * https://leetcode.com/problems/maximum-difference-by-remapping-a-digit
 *
 * Site: Leetcode
 * Level: Easy
 * */

class Solution {
    public int minMaxDifference(int num) {
        char[] arr1 = String.valueOf(num).toCharArray();
        char[] arr2 = String.valueOf(num).toCharArray();
        char changeZero = arr1[0];
        char changeNine = arr2[0];
        for (int i=0; i<arr1.length; i++) {
            if (arr1[i] != '0') {
                changeZero = arr1[i];
                break;
            }
        }
        for (int i=0; i<arr2.length; i++) {
            if (arr2[i] != '9') {
                changeNine = arr2[i];
                break;
            }
        }
        for (int i=0; i<arr1.length; i++) {
            if (arr1[i] == changeZero) {
                arr1[i] = '0';
            }
            if (arr2[i] == changeNine) {
                arr2[i] = '9';
            }
        }

        return Integer.parseInt(String.valueOf(arr2)) - Integer.parseInt(String.valueOf(arr1));
    }
}