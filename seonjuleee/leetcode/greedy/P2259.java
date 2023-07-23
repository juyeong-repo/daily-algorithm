/**
 * 2023.07.23
 * 2259. Remove Digit From Number to Maximize Result
 * https://leetcode.com/problems/remove-digit-from-number-to-maximize-result
 *
 * Site: Leetcode
 * Level: Easy
 * */
class Solution {
    public String removeDigit(String number, char digit) {
        char[] num = number.toCharArray();

        int lastIdx = -1;

        for (int i=0; i<num.length; i++) {
            if (num[i] == digit) {
                if (i != num.length-1) {
                    if (num[i] < num[i+1]) {
                        num[i] = '.';
                        lastIdx = -1;
                        break;
                    } else {
                        lastIdx = i;
                    }
                } else {
                    num[i] = '.';
                    lastIdx = -1;
                }
            }
        }

        if (lastIdx != -1) {
            num[lastIdx] = '.';
        }

        return String.valueOf(num).replace(".", "");

    }
}