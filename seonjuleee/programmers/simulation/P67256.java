/**
 * 2023.07.16
 * 67256. 키패드 누르기
 * https://school.programmers.co.kr/learn/courses/30/lessons/67256
 *
 * Site: Programmers
 * Level: 1
 * */

class Solution {
    public int distanceSquare(int num1, int num2) {
        int x1 = (num1 - 1) / 3;
        int x2 = (num2 - 1) / 3;
        int y1 = (num1 - 1) % 3;
        int y2 = (num2 - 1) % 3;
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }

    public String solution(int[] numbers, String hand) {
        char[] leftOrRight = new char[numbers.length];
        int left = 10; // * 위치
        int right = 12; // # 위치

        for (int i=0; i<numbers.length; i++) {
            int num = numbers[i];
            if (num == 0) num = 11; // 0 위치에 해당하는 숫자로 변경
            if (num % 3 == 1) {
                leftOrRight[i] = 'L';
                left = num;
            } else if (num % 3 == 0) {
                leftOrRight[i] = 'R';
                right = num;
            } else {
                // 왼쪽 엄지손가락 위치와 num 사이의 거리
                int leftDistance = distanceSquare(num, left);
                // 오른쪽 엄지손가락 위치와 num 사이의 거리
                int rightDistance = distanceSquare(num, right);
                if (leftDistance == rightDistance) {
                    if (hand.equals("right")) {
                        leftOrRight[i] = 'R';
                        right = num;
                    } else {
                        leftOrRight[i] = 'L';
                        left = num;
                    }
                } else if (leftDistance < rightDistance) {
                    leftOrRight[i] = 'L';
                    left = num;
                } else {
                    leftOrRight[i] = 'R';
                    right = num;
                }
            }
        }

        return String.valueOf(leftOrRight);
    }
}