# 출처: https://school.programmers.co.kr/learn/courses/30/lessons/12932
def solution(n):
    return list(map(int,reversed(str(n))))

# reverse() 와 reversed() 는 다르다. print문을 사용해 뽑는 게 아니라면 reversed()를 사용해야한다.
# map()에 int 와 리스트를 넣으면, 리스트의 모든 요소를 int를 사용하여 변환한다. 그 이후 list()를 사용해서 map의 결과를 다시 리스트로 변환한다. 