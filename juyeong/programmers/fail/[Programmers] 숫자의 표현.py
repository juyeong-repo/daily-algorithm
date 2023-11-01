# Link :

"""
1.투포인터 (O(n))
2.DP 
3.수학적 풀이
"""


def solution(n):
    '''
    1. Two Pointer 사용
    1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
    f   b
    front pointer, back pointer, desire 3개의 변수 선언
    b을 움직이며 b 앞의 총합이 desire보다 작다면 : b++
    desire과 일치 or 크다면: f++

    front: 빠질 녀석
    total: front와 back 사이 모두 더한 것, n==total
    '''
    answer = 0
    front, total, back = 1,1,2
    while front < back: #total이 양수
        if total < n :
            total += back #total에 back 더하고
            back += 1   #한칸 밀기
        elif n < total : #f가 더 큰 경우
            total -= front
            front += 1
        else: #n == total
            answer += 1
            total -= front 
            ''' b를 증가시켜도 가능
            total += back
            back += 1 
            '''
            front += 1
    return answer

