# Link : https://school.programmers.co.kr/learn/courses/30/lessons/12951

#01 Using upper(),lower()
def solution(string):
    answer = ' '
    string=string.lower()
    for s in string:
        if s.isalpha() and answer[-1] == ' ':
            answer+=s.upper()
        else:
            answer+=s
    return answer[1:]
    
#02 Using capitalize()
def solution(s):
    return ' '.join([word.capitalize() for word in s.split(" ")])

#03 Using title() -> 3people을 3People로 변환하여 실패함
def Jaden_Case(s):
    return s.title()


# 기타 풀이 방법 추가하기