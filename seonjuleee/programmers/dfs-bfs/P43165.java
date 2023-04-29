/**
 * 2023.04.29
 * 43165. 타겟 넘버
 * https://school.programmers.co.kr/learn/courses/30/lessons/43165
 *
 * Site: Programmers
 * Level: 2
 * */

class Solution {
    public int answer;
    public int calculate(int idx, int sum, int[] numbers, int target) {
        if (idx == numbers.length) {
            if (sum == target) return answer++;
            else return answer;
        }

        calculate(idx+1, sum + numbers[idx], numbers, target);
        calculate(idx+1, sum - numbers[idx], numbers, target);

        return answer;
    }

    public int solution(int[] numbers, int target) {
        answer = 0;

        calculate(0, 0, numbers, target);

        return answer;
    }
}