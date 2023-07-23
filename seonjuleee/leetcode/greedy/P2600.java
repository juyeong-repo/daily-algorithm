/**
 * 2023.07.19
 * 2600. K Items With the Maximum Sum
 * https://leetcode.com/problems/k-items-with-the-maximum-sum
 *
 * Site: Leetcode
 * Level: Easy
 * */
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if (numOnes >= k) {
            return k;
        } else if (numOnes + numZeros >= k) {
            return numOnes;
        } else {
            return numOnes - (k - numOnes - numZeros);
        }
    }
}