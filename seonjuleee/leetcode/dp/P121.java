/**
 * 2023.05.21
 * 121. Best Time to Buy and Sell Stock
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock
 *
 * Site: Leetcode
 * Level: Easy
 * */

import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
        int[] maxProfit = new int[prices.length];
        int[] minPrice = new int[prices.length];
        minPrice[0] = prices[0];

        for (int i=1; i<prices.length; i++) {
            minPrice[i] = Math.min(minPrice[i-1], prices[i]);
            maxProfit[i] = Math.max(prices[i] - minPrice[i], maxProfit[i-1]);
        }

        return maxProfit[prices.length-1];
    }
}