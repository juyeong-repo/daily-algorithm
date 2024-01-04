#Link : https://school.programmers.co.kr/learn/courses/30/lessons/12911
"""
처음에 answer = n 을 놓침..
그 외엔 며칠전에 푼 bin() 함수 사용 참고했더니 스무스하게 통과
"""

def solution(n):
    answer = n 
    while True:
        answer += 1
        a = bin(n)[2:]
        b = bin(answer)[2:] 

        if a.count("1") == b.count("1"):
            break
            
    return answer
        
