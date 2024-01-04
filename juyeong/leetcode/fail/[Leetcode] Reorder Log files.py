# https://leetcode.com/problems/reorder-data-in-log-files/

class Solution:
    def reorderLogFiles(self, logs: List[str]) -> List[str]:
        letters , digits = [], []
        for log in logs:
            if log.split()[1].isalpha():
                letters.append(log)
            else:
                digits.append(log)
                
        letters.sort(key = lambda x: (x.split()[1:], x.split()[0]))
        return letters + digits
            

# 데이터 정렬까지 ok 람다사용하여 두개 값 리턴하는게 익숙하지 않음 
            