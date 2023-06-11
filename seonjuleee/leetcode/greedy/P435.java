/**
 * 2023.06.11
 * 435. Non-overlapping Intervals
 * https://leetcode.com/problems/non-overlapping-intervals
 *
 * Site: Leetcode
 * Level: Medium
 * */
import java.util.*;
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int answer = 1;
        Arrays.sort(intervals, (a, b) -> {
            if (a[1] == b[1]) return 0;
            return a[1] - b[1];
        });

        int tmp = intervals[0][1];
        for (int i=1; i<intervals.length; i++) {
            if (intervals[i][0] >= tmp) {
                answer++;
                tmp = intervals[i][1];
            }
        }

        return intervals.length - answer;
    }
}