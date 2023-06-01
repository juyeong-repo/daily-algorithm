# 처음엔 그냥 일케 하면 되잔아 ㅋ 했다가
def solution(price, money, count):
    answer = 0
    if money < (price * count) :
        answer = abs((price * count) - money)

    return answer

# 문제를 제대로 안본거죠.. 이게 제일 이해하기 쉬운 방법
def solution(price, money, count):
    res = 0
    for i in range(1,count+1):
        res += price*i
    if res >= money:
        answer = res -money
    else:
        answer = 0


    return answer
# 최선인지는 모르겠음 등차수열 이용한 풀이도 있던데 그것도 보자