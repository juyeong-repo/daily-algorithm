/**
 * 2023.06.20
 * 2144. Minimum Cost of Buying Candies With Discount
 * https://leetcode.com/problems/minimum-cost-of-buying-candies-with-discount
 *
 * Site: Leetcode
 * Level: Easy
 * */
import java.util.*;
class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int answer = 0;
        int cnt = 1;
        for (int i=cost.length-1; i>=0; i--) {
            if (cnt % 3 != 0) {
                answer += cost[i];
            }
            cnt++;
        }
        return answer;
    }
}