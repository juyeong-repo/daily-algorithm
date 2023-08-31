/**
 * 2023.08.16
 * 784. Letter Case Permutation
 * https://leetcode.com/problems/letter-case-permutation
 *
 * Site: Leetcode
 * Level: Medium
 * */

import java.util.*;
import java.lang.*;

class Solution {
    private String str = "";
    private List<String> list = new ArrayList<>();

    public void dfs(StringBuilder s, int index) {
        if (index == str.length()) {
            list.add(s.toString());
            return;
        }
        char c = str.charAt(index);
        if (c >= 65) { // 문자인지 판별
            dfs(s.append(Character.toLowerCase(c)), index + 1);
            s.deleteCharAt(s.length() - 1);
            dfs(s.append(Character.toUpperCase(c)), index + 1);
            s.deleteCharAt(s.length() - 1);
        } else {
            dfs(s.append((c - '0')), index + 1);
            s.deleteCharAt(s.length() - 1);
        }
    }

    public List<String> letterCasePermutation(String s) {
        str = s;
        dfs(new StringBuilder(), 0);
        return list;
    }

}