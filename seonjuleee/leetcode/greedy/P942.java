/**
 * 2023.06.05
 * 942. DI String Match
 * https://leetcode.com/problems/di-string-match
 *
 * Site: Leetcode
 * Level: Easy
 * */
class Solution {
    public int[] diStringMatch(String s) {
        char[] c = s.toCharArray();
        int[] answer = new int[s.length()+1];

        int a = 0; int b = s.length();
        for (int i=0; i<s.length(); i++) {
            if (c[i] == 'I') {
                answer[i] = a++;
            } else {
                answer[i] = b--;
            }
        }
        answer[s.length()] = b;
        return answer;
    }
}