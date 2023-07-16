/**
 * 2023.07.15
 * 67257. 수식 최대화
 * https://school.programmers.co.kr/learn/courses/30/lessons/67257
 *
 * Site: Programmers
 * Level: 2
 * */

import java.util.*;
class Solution {
    public long solution(String expression) {
        long answer = 0;
        String[] operator = expression.replaceAll("[0-9]", "").split("");
        String[] operand = expression.split("[*+-]");
        String[] priority = {"+-*", "+*-", "-*+", "-+*", "*-+", "*+-"};

        for (String p : priority) {
            List<String> operatorL = new ArrayList<>();
            List<Long> operandL = new ArrayList<>();

            for (String o : operator) {
                operatorL.add(o);
            }

            for (String o : operand) {
                operandL.add(Long.parseLong(o));
            }

            for (int i=0; i<3; i++) {
                String ex = p.substring(i, i+1);
                int j=0;
                while (j<operatorL.size()) {
                    String op = operatorL.get(j);
                    if (ex.equals(op)) {
                        long num1 = operandL.get(j);
                        long num2 = operandL.get(j+1);
                        if (op.equals("+")) {
                            operandL.set(j, num1 + num2);
                            operandL.remove(j+1);
                            operatorL.remove(j);
                        } else if (op.equals("-")) {
                            operandL.set(j, num1 - num2);
                            operandL.remove(j+1);
                            operatorL.remove(j);
                        } else {
                            operandL.set(j, num1 * num2);
                            operandL.remove(j+1);
                            operatorL.remove(j);
                        }
                    } else {
                        j++;
                    }
                }
            }
            answer = Math.max(answer, Math.abs(operandL.get(0)));
        }

        return answer;
    }
}