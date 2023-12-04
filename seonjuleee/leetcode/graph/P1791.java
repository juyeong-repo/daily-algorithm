/**
 * 2023.12.05
 * 1791. Find Center of Star Graph
 * https://leetcode.com/problems/find-center-of-star-graph
 *
 * Site: Leetcode
 * Level: Easy
 * */
class Solution {
    public int findCenter(int[][] edges) {
        int[] count = new int[edges.length+2];
        for (int i=0; i<edges.length; i++) {
            count[edges[i][0]]++;
            count[edges[i][1]]++;
        }

        for (int i=1; i<count.length; i++) {
            if (count[i] == edges.length) return i;
        }

        return -1;
    }
}