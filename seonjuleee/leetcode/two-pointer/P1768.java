/**
 * 2023.11.05
 * 1768. Merge Strings Alternately
 * https://leetcode.com/problems/merge-strings-alternately
 *
 * Site: Leetcode
 * Level: Easy
 * */
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i < word1.length() && j < word2.length()) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(j));
            i++; j++;
        }
        if (i < word1.length()) {
            sb.append(word1.substring(i));
        }
        if (j < word2.length()) {
            sb.append(word2.substring(j));
        }
        return sb.toString();
    }
}