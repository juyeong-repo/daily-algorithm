class Solution:
    def removeDuplicateLetters(self, s: str) -> str:
        
        counter , stack = collections.Counter(s), []
        
        for char in s:
            counter[char] -= 1
            if char in stack :
                continue
            # 뒤에 붙일 문자가 남아 있으면 스택에서 제거
            while stack and char < stack[-1] and counter[stack[-1]] > 0:
                stack.pop()
            stack.append(char)
            
        return ''.join(stack)
        
        
# stack 특성을 좀 더 이용한 풀이
class Solution2:
    def removeDuplicateLetters(self, s: str) -> str:
        
        counter,seen,stack = collections.Counter(s),set() ,[]
        
        for char in s:
            counter[char] -= 1
            if char in seen :
                continue
            # 뒤에 붙일 문자가 남아 있으면 스택에서 제거
            while stack and char < stack[-1] and counter[stack[-1]] > 0:
                seen.remove(stack.pop())
            stack.append(char)
            seen.add(char)
            
        return ''.join(stack)
        
        