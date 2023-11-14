# Link : https://school.programmers.co.kr/learn/courses/30/lessons/12980

def solution(n):
    """
    현재위치 current_location = 0
    도착지 = current_location + N = destination

    k칸을 앞으로 점프 :current_location +k  (건전지 k만큼 소요)
    순간이동 : current_location * 2
        이 때, current_location >= 1 (건전지 소요x, more efficient)
    
    직선 이동, 대각선 이동 -> 이건 상관 없다
    
    N이 주어졌을 때, 점프를 최소화하면 몇인지?

    5	2

    DP 문제!
    메모이제이션 사용한 재귀
    
    1. 케이스 설명을 보고 경우의 수를 따져보자 recursion 반복됨
    -> 이 때 트리를 계속 그리다보면 분기 너무 많아짐 
    -> 메모이제이션 사용하자
    """
    
    
    
    ans = 0
    
    # [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    print('Hello Python')

    return ans



def solution(n):
    
    # 인덱스만큼 이동할때, 최소 움직임
    # 0,0
    # 1,1
    # 2,1 n번째 칸까지 고려해야한다
    smallestMove = [0 for __ in range(n+1)]

    #초기화
    smallestMove = [1] = 1
    
    for idx in range(2, n+1):
        #현재칸의 최소 move

        smallestMove[idx]= mid(smallestMove)
        


def solution(n):
    ans = 0
    while n:
        if n % 2 == 0:
            n = n // 2
        else:
            n = n - 1
            ans += 1
    return ans



    def solution(n):
    ans = 0
    while n:
        if n % 2 == 0: #짝수거리만큼 이동
            n = n // 2 #건전지 소모량 없음
        else: #홀수거리만큼 이동 ->무조건 건전지 소모됐을 것
            n = n - 1 //
            ans += 1
    return ans



# 참고한 다른 링크 : https://velog.io/@ju_h2/Python-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-level2-%EC%A0%90%ED%94%84%EC%99%80-%EC%88%9C%EA%B0%84-%EC%9D%B4%EB%8F%99

"""
"사용해야 하는 건전지 사용량의 최솟값을 return하는 solution 함수를 만들어 주세요."
거꾸로 2로 나눠가면서 구자. 2로 나눠지지 않으면, 점프가 필요하다. -> 건전지 사용 +1
아 목적지가 0이 되는 N으로 생각하는구나

"""

def solution(N):
    answer = 0
    while N > 0:
        answer += N % 2
        n = n // 2

    return answer
