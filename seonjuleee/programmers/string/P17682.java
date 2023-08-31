/**
 * 2023.08.26
 * 17682. 다트 게임
 * https://school.programmers.co.kr/learn/courses/30/lessons/17682
 *
 * Site: Programmers
 * Level: 1
 * */

import java.util.*;
class Solution {
    public class Score {
        int point;
        char bonus;
        char option;

        public Score(int point, char bonus, char option) {
            this.point = point;
            this.bonus = bonus;
            this.option = option;
        }
    }

    public int solution(String dartResult) {
        int answer = 0;

        List<Score> results = new ArrayList<>();
        List<Integer> scores = new ArrayList<>();

        int start = 0;
        for (int i=0; i<dartResult.length(); i++) {
            char c = dartResult.charAt(i);

            if (c == 'S' || c == 'D' || c == 'T') {
                if (i+1 < dartResult.length()) {
                    char nc = dartResult.charAt(i+1);
                    if (nc == '*' || nc == '#') {
                        results.add(new Score(Integer.valueOf(dartResult.substring(start, i)), dartResult.charAt(i), dartResult.charAt(i+1)));
                        start = i+2;
                    } else {
                        results.add(new Score(Integer.valueOf(dartResult.substring(start, i)), dartResult.charAt(i), '.'));
                        start = i+1;
                    }
                } else {
                    results.add(new Score(Integer.valueOf(dartResult.substring(start, i)), dartResult.charAt(i), '.'));
                }
            }
        }

        for (int i=0; i<results.size(); i++) {
            Score r = results.get(i);
            int score = 0;
            switch (r.bonus) {
                case 'S' :
                    score = r.point;
                    break;
                case 'D' :
                    score = r.point * r.point;
                    break;
                case 'T' :
                    score = r.point * r.point * r.point;
                    break;
            }
            if (r.option == '*') {
                if (i > 0) {
                    int prev = scores.get(i-1);
                    System.out.println("prev : " + prev);
                    prev *= 2;
                    scores.set(i-1, prev);
                }
                score *= 2;
            } else if (r.option == '#') {
                score *= -1;
            }
            scores.add(score);
        }

        for (int i=0; i<scores.size(); i++) {
            answer += scores.get(i);
        }

        return answer;
    }
}