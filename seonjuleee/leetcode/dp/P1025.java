/**
 * 2023.05.30
 * 1025. Divisor Game
 * https://leetcode.com/problems/divisor-game
 *
 * Site: Leetcode
 * Level: Easy
 * */

class Solution {
    public boolean divisorGame(int n) {
        // alice가 먼저 시작하고, n이 1일 때는 false, n이 2일 때는 true이므로
        // n이 짝수 일 때는 alice가 1을 선택해 홀수로 만들면 되므로 이길 수 있다.
        // n이 홀수 일 때는 alice가 뭘 선택하든 모두 홀수 밖에 되지 않아 홀수에서 홀수를 빼면 짝수이므로, alice가 질 수 밖에 없다.
        return n % 2 == 0;
    }
}