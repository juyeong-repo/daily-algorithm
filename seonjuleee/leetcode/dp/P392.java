/**
 * 2023.06.12
 * 392. Is Subsequence
 * https://leetcode.com/problems/is-subsequence
 *
 * Site: Leetcode
 * Level: Easy
 * */

class Solution {
    public boolean isSubsequence(String s, String t) {
        int sIdx = 0; int tIdx = 0;

        while (sIdx < s.length() && tIdx < t.length()) {
            if (s.charAt(sIdx) == t.charAt(tIdx)) {
                sIdx++;
            }
            tIdx++;
        }

        return sIdx == s.length();
    }
}