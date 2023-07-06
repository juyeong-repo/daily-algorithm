/**
 * 2023.07.06
 * 1323. Maximum 69 Number
 * https://leetcode.com/problems/maximum-69-number
 *
 * Site: Leetcode
 * Level: Easy
 * */
class Solution {
    public int maximum69Number (int num) {
        char[] numStr = String.valueOf(num).toCharArray();
        for (int i=0; i<numStr.length; i++) {
            if (numStr[i] == '6') {
                numStr[i] = '9';
                String str = new String(numStr);
                return Integer.valueOf(str);
            }
        }

        return num;
    }
}