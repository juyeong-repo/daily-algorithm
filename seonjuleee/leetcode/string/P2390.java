/**
 * 2023.08.27
 * 2390. Removing Stars From a String
 * https://leetcode.com/problems/removing-stars-from-a-string
 *
 * Site: Leetcode
 * Level: Medium
 * */
import java.util.*;
class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        for (int i=0; i<arr.length; i++) {
            if (arr[i] != '*') {
                stack.push(arr[i]);
            } else {
                stack.pop();
            }
        }
        char[] result = new char[stack.size()];
        for (int i=stack.size()-1; i>=0; i--) {
            result[i] = stack.pop();
        }
        return String.valueOf(result);
    }
}