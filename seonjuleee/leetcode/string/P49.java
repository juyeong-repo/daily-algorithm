/**
 * 2023.08.28
 * 49. Group Anagrams
 * https://leetcode.com/problems/group-anagrams
 *
 * Site: Leetcode
 * Level: Medium
 * */
import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answer = new ArrayList<>();
        String[] sortStr = new String[strs.length];
        // 문자열 정렬
        for (int i=0; i<strs.length; i++) {
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            sortStr[i] = String.valueOf(arr);
        }

        // map에 넣기
        Map<String, List<String>> map = new HashMap<>();
        for (int i=0; i<strs.length; i++) {
            List<String> list = new ArrayList<>();
            if (map.containsKey(sortStr[i])) {
                list = map.get(sortStr[i]);
            }
            list.add(strs[i]);
            map.put(sortStr[i], list);
        }

        for (String key : map.keySet()) {
            answer.add(map.get(key));
        }

        return answer;
    }
}