/**
 * 2023.06.10
 * 1405. Reducing Dishes
 * https://leetcode.com/problems/reducing-dishes
 *
 * Site: Leetcode
 * Level: Hard
 * */
import java.util.*;
class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int len = satisfaction.length;
        int sum = 0;
        int coefficient = 0;
        int ans = 0;

        for (int i=len-1; i>=0; i--) {
            if (sum + satisfaction[i] <= 0) {
                break;
            }
            sum += satisfaction[i];
            coefficient += sum;
            ans = Math.max(ans, coefficient);
        }
        return ans;
    }
}