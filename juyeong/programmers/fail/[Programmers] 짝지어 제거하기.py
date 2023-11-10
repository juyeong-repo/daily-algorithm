#Link : https://school.programmers.co.kr/learn/courses/30/lessons/12973

"""
같은 알파벳이 짝수개 있으면 된다.
if aaa bbbb cc 이렇게 정렬된다면,
    1) 짝수개인지 확인
    2) 1 리턴

    아, 제거할필요가 없다. 결국엔 
    정렬했을 때 갯수가 짝수인지만 확인하면 된다. 

    for 문 돌면서 count() 함수 적용

"""

def solution(n):
    answer = 0
    
    n = sorted(n)
    
    for i in range(len(n)):
        if n.count(i) % 2 ==0 :
            answer == 1
        else:
            answer == 0
        print(answer)

    return answer

"""
처음 이렇게 작성하면 테스트 케이스 반만 통과한다. 이유는 첫번째 원소만 체크하기 때문
    1) 투포인터를 사용해야 할까? -> 경우의 수를 하나씩 따지는거 아니니까 사용할 필요X
    2) 예전에 스택 사용한 방법 (https://school.programmers.co.kr/learn/courses/30/lessons/12909) 찾아보고 다시풀기
    3) 위의 코드 개선해서 해결할 수 있을걸 더 고민하자
"""        

# 딕셔너리로 선언 -> 스택 사용하기 위함
str_dict = {"(":1, ")":-1}

def solution(s):
    current_val = 0
    for i in s:
        # s = "()()"
        current_val += str_dict[i] #current_val를 하나씩 증가시킴
        if current_val < 0:
            return False # 처음 들어왔을 때 ")" 이면 false 처리
        return True if curent_val == 0 else False
            # curent_val == 0 -> 스택에서 나감


    