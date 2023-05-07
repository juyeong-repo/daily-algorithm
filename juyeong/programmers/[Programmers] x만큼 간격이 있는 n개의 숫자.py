# 출처: https://school.programmers.co.kr/learn/courses/30/lessons/12954

# x씩 증가하는 n개의 길이 리스트 반환하기
def solution(x, n):
    # 빈 배열 선언
    answer = []
    # n개의 길이만큼 반복문을 돌며 배열에 x*i값 추가
    for i in range(1, n+1):
        answer.append(x*i)
    return answer

# 위 코드는 하나의 리스트로 변환 가능
def solution(x, n):
    return [x*i for i in range(1, n+1)]

