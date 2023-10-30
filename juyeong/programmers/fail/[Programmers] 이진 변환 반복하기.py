# Link: https://school.programmers.co.kr/learn/courses/30/lessons/70129
# 파이썬 bin().. 강력하다

def solution(x):
    answer = [0,0] # 이진 변환의 횟수와 변환 과정에서 제거된 모든 0의 개수
    while not x == "1" : #0일 때
        answer[1] += x.count("0")
        only1s = "1" * x.count("1") # 1을 모두 제거
        # x의 길이를 c라고 하면, x를 "c를 2진법으로 표현한 문자열"로 바꾸기
        c = len(only1s)
        x = bin(c)[2:]
        answer[0] += 1 
        
    return answer 