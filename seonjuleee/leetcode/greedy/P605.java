/**
 * 2023.07.10
 * 605. Can Place Flowers
 * https://leetcode.com/problems/can-place-flowers
 *
 * Site: Leetcode
 * Level: Easy
 * */
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i=0; i<flowerbed.length; i++) {
            if (i>0 && flowerbed[i-1] == 1) continue;
            if (i<flowerbed.length-1 && flowerbed[i+1] == 1) continue;
            if (flowerbed[i] == 1) continue;
            flowerbed[i] = 1;
            n--;
        }

        if (n <= 0) return true;
        else return false;
    }
}