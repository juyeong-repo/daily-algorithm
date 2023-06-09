# 20. Valid Parentheses
class Solution:
    def isValid(self, s: str) -> bool:
        # 스택을 사용한다.
        # 파이썬의 리스트는 push,pop모두 O(1) 에 동작한다.
        
        stack = []
        
        # 딕셔너리 형으로 선언 
        table = {
            ')':'(',
            ']':'[',
            '}':'{'
        }
        

        for char in s:
            if char not in table: 
                stack.append(char)
            elif not stack or table[char] != stack.pop():
                return False
            
        return len(stack) == 0