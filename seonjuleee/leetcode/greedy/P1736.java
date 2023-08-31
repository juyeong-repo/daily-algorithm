/**
 * 2023.07.24
 * 1736. Latest Time by Replacing Hidden Digits
 * https://leetcode.com/problems/latest-time-by-replacing-hidden-digits
 *
 * Site: Leetcode
 * Level: Easy
 * */
class Solution {
    public String maximumTime(String time) {
        char[] timeArr = time.toCharArray();
        if (timeArr[0] == '?') {
            if (timeArr[1] - '0' < 4 || timeArr[1] == '?') {
                timeArr[0] = '2';
            } else {
                timeArr[0] = '1';
            }
        }
        if (timeArr[1] == '?') {
            if (timeArr[0] == '2') {
                timeArr[1] = '3';
            } else {
                timeArr[1] = '9';
            }
        }
        if (timeArr[3] == '?') {
            timeArr[3] = '5';
        }
        if (timeArr[4] == '?') {
            timeArr[4] = '9';
        }
        return String.valueOf(timeArr);
    }
}