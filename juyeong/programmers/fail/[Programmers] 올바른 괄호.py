# Link: https://school.programmers.co.kr/learn/courses/30/lessons/12909
# 스택을 이용해서 풀어야 한다🥹

def solution(s):
    Stack = []
    
    for bracket in s:
        if bracket == "(":
            Stack.append(bracket)
        elif bracket == ")":
            if Stack and Stack[-1] == "(":
                del Stack[-1]
            else :
                Stack.append(bracket)
                
    return False if Stack else True
        
