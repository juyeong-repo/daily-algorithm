# LINK :https://school.programmers.co.kr/learn/courses/30/lessons/42842

"""
가로는 무조건 세로이상
brown 8 - 5,000
yellow 1 - 2,000,000

-> 즉 가로로 넓은 직사각형 모양의 카펫

카펫의 가로,세로를 배열에 담아서 리턴

24 24 

전체가로는 yellow 가로 +2
전체세로는 yellow 세로 +2 

노랑은 무조건 직사각형인가? yes

Brown = (yellow 가로 +2) + (yellow 세로 +2) + 4 (모서리)
return [Brown 가로, Brown 세로]

결국 핵심은 yellow 블럭


둘의 관계
bh , bw = yh+2 , yw+2
brown + yellow = bh * bw

"""

def solution(brown, yellow):
    """

    Brown = (yellow 가로 +2) + (yellow 세로 +2) + 4 (모서리)
    이 수식이 포인트
    yellow 경우의 수를 찾으려면.. 약수

    yellow의 약수이면서, (yellow 가로 +2) + (yellow 세로 +2) + 4 (모서리) = brown의 넓이를 만족하는
    수를 찾자

    return [Brown 가로, Brown 세로] == [yellow 가로 +2, yellow 세로 +2]
    
        
    

    """


    

def solution_notCorrect(brown, yellow):
    answer = []
    yellow_x = 0
    yellow_y = 0
    
    for i in range(1, yellow+1): #절반만
        if yellow % i == 0 :
            yellow_x = int(yellow // i)
            
            yellow_y = i
            
            if yellow_x * 2 + yellow_y * 2 + 4 == brown :
                answer.append(yellow_x + 2)
                answer.append(yellow_x + 2)
                break
                
    # 가로 길이는 세로 길이와 같거나, 세로 길이보다 깁니다.  
    answer = sorted(answer , reverse=True)
    
    return answer

"""
이렇게 하면 테스트 케이스 통과X

수식으로 푸는 문제 -> 방정식을 세우고, 미지수 하나 정해서 범위 내에서 돌리고
나머지 방정식들로 수식 맞는지를 확인 

[방정식 세우기]
1. 브라운은 옐로우의 가로,세로에 2를 더한 것과 같다.
    : bh , bw =  yh+2 , yw+2

2. 전체 넓이
    : yellow + brown = bh * bw = (yh+2) * (yw+2) 

------- 여기서부터 내가 놓친 포인트  

3. 그렇다면 yellow는? 
    : yellow = yh * yw = (bh - 2) * (bw - 2)

4. 
    : brown = bh + bh + bw + bw - 4



"""


def solution(brown, yellow):
    # bh, bw, yh, yw
    for bh in range (1, brown//2 + 1):
        bw = (brown -2 * bh + 4  ) // 2
        yh, yw = bh -2 ,bw -2
        if yellow == yh * yw and yellow + brown == bh * bw:
            return [bw, bh]