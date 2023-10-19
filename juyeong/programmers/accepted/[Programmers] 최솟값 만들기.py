# Link: https://school.programmers.co.kr/learn/courses/30/lessons/12941
def solution(A,B):
    answer = 0
    # A 오름차순, B 내림차순으로 정렬하는 것이 이해안감, A,B 배열의 길이가 같지 않다면..?
    A.sort(reverse = True)
    B.sort()
    
    for i in range(len(A)):
        answer +=(A[i]*B[i])
        
    return answer 
 
#다른 사람 풀이
def getMinSum(A, B):
    return sum([a * b for a, b in zip(sorted(A), sorted(B, reverse=True))])
