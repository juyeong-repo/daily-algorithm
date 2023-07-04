import numpy as np

def solution(numbers):
    '''
    question:  정수 배열 numbers가 매개변수로 주어집니다. 
    numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
    source: https://school.programmers.co.kr/learn/courses/30/lessons/120809
    suedo code:
    1.numpy  -> 행렬연산 가능, 다차원 연산 가능
    2.map 사용하기
    3.lambda
         
    '''
    numbers = np.array(numbers)
    return (numbers * 2).tolist()
    return answer 

# 람다 사용 ( iterable한 객체 : numbers )
def solution2(numbers):
    return list(map(lambda x:x*2, numbers))


# 두배하는 함수 만들어서
def double_function(x):
    return x * 2
# 람다 대신 사용 
def solution2(numbers):
    return list(map(double_function, numbers))




