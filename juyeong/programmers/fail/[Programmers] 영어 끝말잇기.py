# Link : https://school.programmers.co.kr/learn/courses/30/lessons/12981
"""
[제한조건]
n은 2이상 , 10이하 -> 반복문을 돌려도 시간 복잡도가 높지 않다
상수항만큼만 돈다

[예외]
탈락자가 생기지 않는다면 [0,0] 리턴
"""


"""
enumerate를 사용하면 좋을 것 같다. 예를 들어 
    Q. 정수 num과 k가 매개변수로 주어질 때, num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고 
    없으면 -1을 return 하도록 solution 함수를 완성해보세요.
이 문제처럼 사람을 인덱스로 하고 단어를 n으로 치환하여 반복문을 돌린다면? 

list.append
set.add (성능 더 좋음.. 일반적으로)
"""

def solution(n, words):
    '''
    1번부터 번호 순서대로 한 사람씩 차례대로 단어를 말합니다.
    마지막 사람이 단어를 말한 다음에는 다시 1번부터 시작합니다.
    앞사람이 말한 단어의 마지막 문자로 시작하는 단어를 말해야 합니다.
    이전에 등장했던 단어는 사용할 수 없습니다.
    한 글자인 단어는 인정되지 않습니다.
    '''
    
    #이미 말했는지?
    used = set() #리스트 = Linear 타임 소모, 해쉬 /set= Constant
    
    # idx = 몇번째 사람?
    for idx in range(len(words)): 
        # 잘 나오는지 확인 print (idx, word) 
    
        userNum = (idx % n) + 1
        # print (userNum, word)
        
        Turn = (idx // n ) + 1
        
        #  이전에 등장했던 단어는 사용할 수 없습니다 + 한 글자인 단어는 인정되지 않습니다.
        if 1 < len(words[idx]) and words[idx] not in used:
            if idx == 0 : # 앞 사람이 말한 단어가 없는 경우
                used.add(words[idx])
            
            # 앞사람이 말한 단어의 마지막 문자로 시작하는 단어를 말해야 합니다.
            elif words[idx-1][-1] == words[idx][0]:
                used.add(words[idx])
            
            else:
                return [userNum, Turn]
        else: 
            return [userNum, Turn]
        
        #만약 주어진 단어들로 탈락자가 생기지 않는다면, [0, 0]을 return 해주세요.
    return [0,0]