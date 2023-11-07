# LINK:https://school.programmers.co.kr/learn/courses/30/lessons/12945
"""
1. 재귀에 대해 알아보고 -> 피보나치 고민하기
2. DP로 시간 복잡도를 줄일 수 있을지 고민해보기 -> 메모이제이션 
+ for문 사용도 가능
3. 시간, 공간 복잡도를 줄일 수 있는지 

"""

from typing import List

def solution1(n):
    """
    1. 재귀방식으로 풂
    시간 복잡도 O(n^2)로 타임아웃 에러난다!
    """
    if n==0 or n==1:
        return n
    else:
        return solution(n-1) + solution(n-2)



def fib(n:int, memo: List[int]) -> int:
    """
    f(n) 연산 결과를 일차원 배열에 저장 [memo], 피보나치 수열이 0or1일때는 결과값을 알고있음 -> [memo] 배열에 저장
    초기화는 0,1의 인덱스를 제외하고 -1값으로 지정 
    
    """
    if memo[n] == -1: #0,1이 아닌 수가 들어왔을 때
        memo[n] = fib(n-1, memo) + fib(n-2, memo)

        return memo[n]

    n = 4
    memo = [-1] * (n+1)
    memo[0], memo[1] = 0,1
    
    print(fib(n, memo))