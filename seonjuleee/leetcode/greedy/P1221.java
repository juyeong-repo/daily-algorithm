/**
 * 2023.06.23
 * 1221. Split a String in Balanced Strings
 * https://leetcode.com/problems/split-a-string-in-balanced-strings
 *
 * Site: Leetcode
 * Level: Easy
 * */
class Solution {
    public int balancedStringSplit(String s) {
        int answer = 0;
        int tmp = 0;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == 'R') {
                tmp++;
            } else if (s.charAt(i) == 'L') {
                tmp--;
            }
            if (tmp == 0) {
                answer++;
            }
        }
        return answer;
    }
}