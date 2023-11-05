# LINK:
"""
1. 재귀에 대해 알아보고 -> 피보나치 고민하기
2. DP로 시간 복잡도를 줄일 수 있을지 고민해보기 -> 메모이제이션 
3. 시간, 공간 복잡도를 줄일 수 있는지 

"""


def solution(n):
    """
    1. 재귀방식으로 풂
    시간 복잡도 O(n^2)로 타임아웃 에러난다!
    """
    if n==0 or n==1:
        return n
    else:
        return solution(n-1) + solution(n-2)
