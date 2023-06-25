/**
 * 2023.06.22
 * 2578. Split With Minimum Sum
 * https://leetcode.com/problems/split-with-minimum-sum
 *
 * Site: Leetcode
 * Level: Easy
 * */
import java.util.*;
class Solution {
    public int splitNum(int num) {
        int answer = 0;
        String strNum = String.valueOf(num);
        int[] arr = new int[strNum.length()];
        for (int i=0; i<strNum.length(); i++) {
            arr[i] = strNum.charAt(i) - '0';
        }
        Arrays.sort(arr);
        int digit = 1;
        for (int i=arr.length-1; i>=0; i-=2) {
            answer += digit * arr[i];
            if (i > 0) {
                answer += digit * arr[i-1];
            }
            digit *= 10;
        }
        return answer;
    }
}