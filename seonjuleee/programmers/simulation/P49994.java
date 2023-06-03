/**
 * 2023.06.03
 * 49994. 방문 길이
 * https://school.programmers.co.kr/learn/courses/30/lessons/49994
 *
 * Site: Programmers
 * Level: 2
 * */

import java.util.*;
class Solution {
    public boolean isPossible(int x, int y) {
        if (x > 5 || x < -5) {
            return false;
        }
        if (y > 5 || y < -5) {
            return false;
        }
        return true;
    }

    public int solution(String dirs) {
        int x = 0; int y = 0; // start
        HashSet<String> set = new HashSet<>();

        for (char d : dirs.toCharArray()) {
            int nx = x; int ny = y;
            if (d == 'U' && isPossible(x, y+1)) {
                ny++;
            } else if (d == 'D' && isPossible(x, y-1)) {
                ny--;
            } else if (d == 'R' && isPossible(x+1, y)) {
                nx++;
            } else if (d == 'L' && isPossible(x-1, y)) {
                nx--;
            } else {
                continue;
            }

            set.add(""+x+y+nx+ny);
            set.add(""+nx+ny+x+y);
            x = nx; y = ny;
        }

        return set.size() / 2;
    }
}