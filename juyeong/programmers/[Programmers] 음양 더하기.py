# https://school.programmers.co.kr/learn/courses/30/lessons/76501

# zip을 이용한 다른 사람 풀이
def solution(absolutes, signs):
    return sum(absolutes if sign else -absolutes for absolutes, sign in zip(absolutes, signs))


# 처음 풀이
def solution(absolutes, signs):
    answer = 0
    for i in range(len(absolutes)):
        #  참인경우 양수이므로 더하기
        if signs[i]:
            answer += absolutes[i]
        # 거짓인 경우 음수이므로 빼기
        else:
            answer -= absolutes[i]
    return answer