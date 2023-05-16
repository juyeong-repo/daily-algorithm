/**
 * [Silver IV] Title: 빙고, Time: 208 ms, Memory: 17636 KB
 */

import java.util.*;

public class Main {
    private static final int BOARD_SIZE = 5;
    private static final int TARGET_LINES = 3;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 25;

    private int[][] board;
    private int lineCount;

    public Main() {
        board = new int[BOARD_SIZE][BOARD_SIZE];
        lineCount = 0;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        // input bingo board
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = scanner.nextInt();
            }
        }

        for (int k = MIN_NUMBER; k <= MAX_NUMBER; k++) {
            int num = scanner.nextInt();

            markNumber(num);

            checkLines();

            if (lineCount >= TARGET_LINES) {
                System.out.println(k);
                break;
            }
        }
    }

    private void markNumber(int num) {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (board[i][j] == num) {
                    board[i][j] = 0;
                    return;
                }
            }
        }
    }

    private void checkLines() {
        lineCount = 0;
        checkRows();
        checkCols();
        checkDiagonalLeftToRight();
        checkDiagonalRightToLeft();
    }

    private void checkRows() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            int zeroCount = 0;
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (board[i][j] == 0) {
                    zeroCount++;
                }
            }
            if (zeroCount == BOARD_SIZE) {
                lineCount++;
            }
        }
    }

    private void checkCols() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            int zeroCount = 0;
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (board[j][i] == 0) {
                    zeroCount++;
                }
            }
            if (zeroCount == BOARD_SIZE) {
                lineCount++;
            }
        }
    }

    private void checkDiagonalLeftToRight() {
        int zeroCount = 0;
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (board[i][i] == 0) {
                zeroCount++;
            }
        }
        if (zeroCount == BOARD_SIZE) {
            lineCount++;
        }
    }

    private void checkDiagonalRightToLeft() {
        int zeroCount = 0;
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (board[i][BOARD_SIZE - 1 - i] == 0) {
                zeroCount++;
            }
        }
        if (zeroCount == BOARD_SIZE) {
            lineCount++;
        }
    }

    public static void main(String[] args) {
        Main bingo = new Main();
        bingo.play();
    }
}