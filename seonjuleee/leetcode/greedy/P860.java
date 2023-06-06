/**
 * 2023.06.06
 * 860. Lemonade Change
 * https://leetcode.com/problems/lemonade-change
 *
 * Site: Leetcode
 * Level: Easy
 * */

class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0; int ten = 0;

        for (int i=0; i<bills.length; i++) {
            int bill = bills[i];
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                if (five < 1) {
                    return false;
                }
                five--;
                ten++;
            } else {
                if (ten >= 1 && five >= 1) {
                    five--; ten--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}