'''
https://school.programmers.co.kr/learn/courses/30/lessons/176963
그리움의 수를 모두 더하면 추억점수
이름 배열 -> name
점수 배열 (정수) -> yearning
이름을 넣을 이차원 배열이 있고
이 배열에 각 사진의 추억점수를 담아 리턴하기

파이썬 딕셔너리로 키,밸류를 설정하여 키가 밸류값을 물고다니게 한 후
이차원 배열 for 문 돌면서 뱉어내게 하기

근데 생각해보면, 파이썬에서 키/밸류값을 가지고 있을 때 키값을 인덱스로 생각하면
enumerate 사용할 수 있다..고 생각했는데
zip 함수가 있네

'''
def solution1(name, yearning, photo):
    answer = []
    dict = {}
    for i, v in enumerate(name):
        dict[v] = yearning[i]
    
    for i in photo:
        sum = 0
        for j in i:
            try:
                sum += dict[j]
            except:
                print(j)
        answer.append(sum)
    return answer


def solution2(name, yearning, photo):
    dictionary = dict(zip(name,yearning))
    scores = []
    for pt in photo:
        score = 0
        for p in pt:
            if p in dictionary:
                score += dictionary[p]
        scores.append(score)
    return scores



def solution3(name, yearning, photo):
    return [sum(yearning[name.index(j)] for j in i if j in name) for i in photo]
