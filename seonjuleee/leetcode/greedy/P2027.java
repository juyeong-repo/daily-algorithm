/**
 * 2023.07.08
 * 2027. Minimum Moves to Convert String
 * https://leetcode.com/problems/minimum-moves-to-convert-string
 *
 * Site: Leetcode
 * Level: Easy
 * */
class Solution {
    public int minimumMoves(String s) {
        int answer = 0;
        char[] arr = s.toCharArray();
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == 'X') {
                i += 2;
                answer++;
            }
        }
        return answer;
    }
}