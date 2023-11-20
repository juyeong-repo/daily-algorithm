# Link
"""
이 문제는 Greedy, 과정에서 최적의 해를 찾아가며 풀이한다. 최적의 해를 찾기 위해선 기준이 있어야 한다. 
그리디 문제는 기준을 잘 파악하는 것이 중요함.


1.collection deque
    :  1. Deque : 양방향 큐. FIFO방식으로 (은행) 진행되는데, 앞,뒤 양쪽방향에서 
    엘리먼트를 추가/삭제할 수 있다. deque는 양 끝 엘리먼트의 append, pop 속도가 빠르다.
    일반적인 리스트가 O(n)이 소요되는 데 반해, 데크(deque)는 O(1) 상수시간 접근

    : deque.append(item): item을 데크의 오른쪽 끝에 삽입한다.
    deque.appendleft(item): item을 데크의 왼쪽 끝에 삽입한다.
    deque.pop(): 데크의 오른쪽 끝 엘리먼트를 가져오는 동시에 데크에서 삭제한다.
    deque.popleft(): 데크의 왼쪽 끝 엘리먼트를 가져오는 동시에 데크에서 삭제한다.   

2.Two pointer


를 사용하여 풀이할 수 있다.


"""

# 가장 무거운 사람, 가장 가벼운 사람을 묶어서 처리
from collections import deque


def solution_Deque(people, limit):
    answer = 0
    people = deque (sorted(people, reverse = True))
    
    #베이스 케이스, people 배열은 1 초과
    while len(people) > 1:
        if people[0] + people[-1] <= limit :s
            answer += 1
            people.pop() #오른쪽 끝s
            people.popleft() #왼쪽 끝
            
        # limit 초과 안하면, 둘중에 무거운 애 빼자
        else:
            answer += 1
            people.popleft()
    
    # 1명만 남았을 경우 -> 베이스라인 생각하지 못함 '^'
    if people :
        answer += 1
        
        
    return answer
        

def solution_two_pointer(people, limit) :

    answer = 0

    # 몸무게 오름차순 정렬
    people.sort()
    
    # start
    a = 0
    # end : element 마지막 원소 
    b = len (people) - 1

    # start, end = 0, len(people)-1

    while a <= b : # 투 포인터가 순회하는 동안/ 인덱스가 같아지는 시점까지 

        answer += 1

        if people [a]  + people [b] <= limit :
            # start 포인터 이동, 보트의 수 증가 
            a += 1
            # end 포인터 감소 
            b -= 1
        
        # 한명만 남았을 때
        else: 
            b -=1


    return answer