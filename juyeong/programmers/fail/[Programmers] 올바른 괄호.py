# Link: https://school.programmers.co.kr/learn/courses/30/lessons/12909
# 스택을 이용해서 풀어야 한다🥹


#1. 스택을 이용한 풀이 
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
        


#2. 파이썬 dictionary 사용한 풀이
str_dict = {"(":1, ")":-1}

def solution(s):
    current_val = 0
    for i in s:
        current_val += str_dict[i]
        if current_val < 0:
            return False
    return True if current_val == 0 else False 

        