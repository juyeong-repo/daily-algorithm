/**
 * 2023.07.02
 * 2224. Minimum Number of Operations to Convert Time
 * https://leetcode.com/problems/minimum-number-of-operations-to-convert-time
 *
 * Site: Leetcode
 * Level: Easy
 * */
class Solution {
    public int convertTime(String current, String correct) {
        String[] cur = current.split(":");
        String[] cor = correct.split(":");
        int curH = Integer.valueOf(cur[0]);
        int curM = Integer.valueOf(cur[1]);
        int corH = Integer.valueOf(cor[0]);
        int corM = Integer.valueOf(cor[1]);
        int diffTime = (corH * 60 + corM) - (curH * 60 + curM);

        int oneH = diffTime / 60;
        diffTime %= 60;
        int fifteenM = diffTime / 15;
        diffTime %= 15;
        int fiveM = diffTime / 5;
        diffTime %= 5;
        int oneM = diffTime;

        return oneH + fifteenM + fiveM + oneM;
    }
}