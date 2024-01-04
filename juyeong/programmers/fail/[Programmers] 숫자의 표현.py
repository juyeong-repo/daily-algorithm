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



"""
2. 완전탐색 알고리즘
문제를 sub로 쪼갠다. 중간중간 연산값을 저장하여 일차원 배열에 넣은 뒤 활용한다. (메모이제이션)
경우의 수를 따지는 경우에는 DP 사용이 거의 가능한데
메모이제이션을 사용하면 기존 재귀방법이 2의 n승 시간 복잡도라면 O(n)으로 축소(?) 가능하다.
다만 이게 최고의 DP 풀이법인지는 조금 의문 -> 다른 답안 더 찾아보자

2중 포문을 사용하여 연속된 숫자를 sum에 더한다. sum이 n이 되면 answer ++ 후 두번째 포문을 나가서
다시 다음 수부터 시작한다. 이 때, 시간을 줄이기 위해 sum이 n보다 커질 경우 두번째 for문을 나가도록 함

"""

def solution(n):
    answer = 0 #count
    for i in range(1,n+1) : # 제한조건: 자연수 , n+1까지 범위 설정
        sum = 0
        for j in range (i, n+1): 
            sum += j
            if sum == n:
                answer += 1
                break

            elif sum > n:
                break
    return answer
            
    
    



"""
3. 수학적 풀이
수학 공식을 찾아내는 것. 처음 문제를 봤을 때 N * 1/2 +1 범위내에서 돌아도 되겠다고 생각했지만
그 다음 규칙을 찾지는 못해서 아쉽

n 이하인 숫자 a부터 k개의 연속된 숫자의 합이 n이라고 가정
a + (a+1) + (a+2) .. +(a+k-1) = k(2a)



"""


def solution(n):
    return answer 
