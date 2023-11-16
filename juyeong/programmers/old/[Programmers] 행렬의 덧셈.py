# 최적화.. 파이썬 문법에 약하다 
def solution(A, B):
    for i in range(len(A)):
        for j in range(len(A[0])):
            A[i][j] += B[i][j]
    return A