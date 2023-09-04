/**
 * 2023.09.04
 * 13. Roman to Integer
 * https://leetcode.com/problems/roman-to-integer
 *
 * Site: Leetcode
 * Level: Easy
 * */

class Solution {
    public int romanToInt(String s) {
        int prev = 1000;
        int answer = 0;
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            int num = 0;
            switch (c) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
            }
            if (prev < num) {
                answer += (num - prev * 2);
            } else {
                answer += num;
            }
            prev = num;
        }
        return answer;
    }
}