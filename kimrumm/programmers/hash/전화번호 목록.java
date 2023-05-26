import java.io.*;
import java.util.*;

/**
 * 42577. 전화번호 목록
 * [level 2] Title: 전화번호 목록, Time: 229.19 ms, Memory: 133 MB
 */
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Map<String, Integer> map = new HashMap<>();
        for(String s : phone_book) {
            map.put(s, s.length());
        }
        for(int i=0; i<phone_book.length; i++) {
            for(int j=0; j<phone_book[i].length(); j++) {
                if(map.containsKey(phone_book[i].substring(0, j))) return false;
            }
        }
        return answer;
    }
}