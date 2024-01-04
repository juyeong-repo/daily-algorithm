/**
 * 2023.09.05
 * 459. Repeated Substring Pattern
 * https://leetcode.com/problems/repeated-substring-pattern
 *
 * Site: Leetcode
 * Level: Easy
 * */

import java.util.regex.Pattern;
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for (int i=1; i <= len / 2; i++) {
            if (len % i == 0) {
                String sub = s.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for (int j=0; j<len/i; j++) {
                    sb.append(sub);
                }
                if (sb.toString().equals(s)) return true;
            }
        }
        return false;
    }
}