/**
 * 2023.06.29
 * 2160. Minimum Sum of Four Digit Number After Splitting Digits
 * https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits
 *
 * Site: Leetcode
 * Level: Easy
 * */
class Solution {
    public int minimumSum(int num) {
        int[] numArr = new int[4];
        String numStr = String.valueOf(num);
        for (int i=0; i<4; i++) {
            numArr[i] = (int)numStr.charAt(i) - '0';
        }
        Arrays.sort(numArr);
        return (numArr[0] + numArr[1]) * 10 + numArr[2] + numArr[3];
    }
}