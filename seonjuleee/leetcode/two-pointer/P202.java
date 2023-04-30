/**
 * 2023.04.30
 * 202. Happy Number
 * https://leetcode.com/problems/happy-number/
 *
 * Site: Leetcode
 * Level: Easy
 * */

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n)) {
            int tmp = n;
            int sum = 0;
            while (tmp > 0) {
                int digit = tmp % 10;
                sum += Math.pow(digit, 2);
                tmp /= 10;
            }
            set.add(n);
            n = sum;
        }
        if (n == 1) return true;
        return false;
    }
}