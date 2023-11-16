# 출처: https://school.programmers.co.kr/learn/courses/30/lessons/12943
def solution(num):
    answer = 0
    # 처음부터 범위를 500으로 한정지으면 된다
    for i in range(500):
        if num % 2 == 0:
            num = num/2
            answer += 1
        if num == 1:
            break
        if num % 2 != 0:
            num = (num*3)+1
            answer += 1
        if num == 1:
            break
        if answer > 500 and num != 1:
            answer = -1
            break
        # 하지만 if 문 범벅인 코드가 좋아보이진 않는다.. 파이썬에서 한줄로 더 깔끔하게 변형시킬 수 있을 것
    return answer



# 변형한다면 이렇게 할 수 있다 
def collatz(num):
    for i in range(500):
    	if num == 1:
            return i
        num = num / 2 if num % 2 == 0 else num*3 + 1   
    return -1