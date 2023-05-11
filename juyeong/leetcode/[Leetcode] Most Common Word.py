# https://leetcode.com/problems/most-common-word/

import re
from collections import Counter

class Solution:
    def mostCommonWord(self, paragraph: str, banned: List[str]) -> str:
        # data preprocessing
        words = [ word for word in re.sub(r'[^\w]', '  ' ,paragraph)
                .lower().split() 
                    if word not in banned ]
        
        counts = collections.Counter(words)
        
        return counts.most_common(1)[0][0]