# https://school.programmers.co.kr/learn/courses/30/lessons/12948
# phone_number.replace((phone_number[0:-3]),'*') 첨에 이렇게 리턴했다가 ㅎ.. 리스트 슬라이싱이 헷갈리는 이유는 자주 안쓰기 때문이다 반성~
def solution(phone_number):
    return "*"*(len(phone_number)-4) + phone_number[-4:]
