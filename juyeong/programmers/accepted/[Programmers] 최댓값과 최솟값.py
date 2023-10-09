# lv2 
# https://school.programmers.co.kr/learn/courses/30/lessons/12939

def solution(s):
    s = list(map(int, s.split(' ')))
    s.sort()
    
    return str(s[0])+" "+str(s[-1])