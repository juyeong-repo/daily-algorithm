/**
 * 2023.06.25
 * 1974. Minimum Time to Type Word Using Special Typewriter
 * https://leetcode.com/problems/minimum-time-to-type-word-using-special-typewriter
 *
 * Site: Leetcode
 * Level: Easy
 * */
class Solution {
    public int minTimeToType(String word) {
        char c = 'a';
        int answer = 0;
        for (int i=0; i<word.length(); i++) {
            char next = word.charAt(i);
            int move = Math.abs(c - next);
            move = move >= 14 ? 26 - move : move;
            answer += move + 1;
            c = next;
        }
        return answer;
    }
}