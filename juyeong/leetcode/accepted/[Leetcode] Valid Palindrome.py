# https://leetcode.com/problems/valid-palindrome/

# 1. 리스트로 변환
class Solution1:
    def isPalindrome(self, s: str) -> bool:
        # base case
        strs = []
        for char in s:
            # 영문, 숫자일 경우에 (대문자는 소문자로 변형) 리스트에 append
            if char.isalnum():
                strs.append(char.lower())
                
        while len(strs) > 1:
            if strs.pop(0) != strs.pop()
            return False
        
        return True

# 2. deque를 선언하고 popleft() 메소드로 성능을 높인다
class Solution2:
    def isPalindrome(self, s: str) -> bool:
        # deque 자료형으로 선언하여 popleft() 으로 O(1)로 성능 단축 시킬 것
        strs : Deque = collections.deque()
        
        for char in s:
            if char.isalnum():
                strs.append(char.lower())
                
        while len(strs) > 1:
            if strs.popleft() != strs.pop()
            return False
        
        return True

# 3. 문자열 정규표현식을 이용하여 푼다
class Solution3:
    def isPalindrome(self, s: str) -> bool:
        s = s.lower()
        s = re.sub ('[^a-z0-9]','',s)
        
        # 리스트 슬라이싱은 내부적으로 C로 구현되어 있어 속도가 2보다 두배 더 빠름
        return s == s[::-1]