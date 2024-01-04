# 344. Reverse String

class Solution2: #내장함수 사용
    def reverseString(self, s: List[str]) -> None:
        """
        Do not return anything, modify s in-place instead.
        """
        s.reverse()
        
        
class Solution: #투포인터 사용
    def reverseString(self, s: List[str]) -> None:
        """
        Do not return anything, modify s in-place instead.
        """
        left, right = 0,len(s) -1
        while left < right :
            s[left], s[right] = s[right], s[left]
            left +=1
            right -=1
        
        
        