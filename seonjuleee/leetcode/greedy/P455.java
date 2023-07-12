/**
 * 2023.07.10
 * 455. Assign Cookies
 * https://leetcode.com/problems/assign-cookies
 *
 * Site: Leetcode
 * Level: Easy
 * */

import java.util.*;
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int answer = 0;

        int j=0;
        for (int i=0; i<g.length && j<s.length;) {
            if (s[j] >= g[i]) {
                answer++;
                i++;
            }
            j++;
        }

        return answer;
    }
}