/**
 * 2023.05.16
 * 119. Pascal's Triangle II
 * https://leetcode.com/problems/pascals-triangle-ii
 *
 * Site: Leetcode
 * Level: Easy
 * */

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<=rowIndex; i++) {
            List<Integer> list = new ArrayList<>();
            for(int j=0; j<=i; j++) {
                if(j == 0 || j == i) {
                    list.add(1);
                } else {
                    int left = result.get(j-1);
                    int right = result.get(j);
                    list.add(left + right);
                }
            }
            result = list;
        }
        return result;
    }
}