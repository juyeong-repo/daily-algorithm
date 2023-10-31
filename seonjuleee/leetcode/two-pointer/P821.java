/**
 * 2023.10.31
 * 821. Shortest Distance to a Character
 * https://leetcode.com/problems/shortest-distance-to-a-character/
 *
 * Site: Leetcode
 * Level: Easy
 * */
class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] arr = new int[s.length()];
        for (int i=0; i<s.length(); i++) {
            arr[i] = s.length();
        }
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == c) {
                arr[i] = 0;
                for (int k=1; i-k>=0; k++) {
                    arr[i-k] = Math.min(k, arr[i-k]);
                }
                for (int k=1; i+k<s.length(); k++) {
                    arr[i+k] = Math.min(k, arr[i+k]);
                }
            }
        }
        return arr;
    }
}