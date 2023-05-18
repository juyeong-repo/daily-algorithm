# https://school.programmers.co.kr/learn/courses/30/lessons/12934
def solution(n):
    sqrt = n**(1/2)
    
    if sqrt % 1 == 0:
        return (sqrt+1)**2
    
    return -1