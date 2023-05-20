# https://leetcode.com/problems/group-anagrams/submissions/
from collections import defaultdict
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
       
        result = collections.defaultdict(list)
        
        for str in strs :
            result[''.join(sorted(str))].append(str)
        return list(result.values())