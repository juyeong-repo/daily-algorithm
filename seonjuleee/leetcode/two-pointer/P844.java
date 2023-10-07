/**
 * 2023.10.07
 * 844. Backspace String Compare
 * https://leetcode.com/problems/backspace-string-compare
 *
 * Site: Leetcode
 * Level: Easy
 * */
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> sStack = new Stack();
        Stack<Character> tStack = new Stack();

        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == '#') {
                if (!sStack.isEmpty()) {
                    sStack.pop();
                }
            } else {
                sStack.push(c);
            }
        }
        StringBuilder sBuilder = new StringBuilder();
        while (!sStack.isEmpty()) {
            sBuilder.append(sStack.pop());
        }

        for (int i=0; i<t.length(); i++) {
            char c = t.charAt(i);
            if (c == '#') {
                if (!tStack.isEmpty()) {
                    tStack.pop();
                }
            } else {
                tStack.push(c);
            }
        }
        StringBuilder tBuilder = new StringBuilder();
        while (!tStack.isEmpty()) {
            tBuilder.append(tStack.pop());
        }

        if (sBuilder.toString().equals(tBuilder.toString())) {
            return true;
        }
        return false;
    }
}