import java.util.*;

/**
 * [level 1] 같은 숫자는 싫어 - 12906
 * 메모리: 126 MB, 시간: 47.56 ms
 * 코딩테스트 연습 > 스택／큐
 */

public class Solution {
    public int[] solution(int []arr) {        
        Stack<Integer> stack = new Stack<>();

        for (int n : arr) {
            if (stack.isEmpty() || stack.peek() != n) {
                stack.add(n);
            }
        }

        int[] answer = new int[stack.size()];
        int index = 0;
        for (int n : stack) {
            answer[index++] = n;
        }

        return answer;
    }
}