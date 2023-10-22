# LINK : https://leetcode.com/problems/two-sum/
# 4가지 방식으로 풀이 가능


# Brute force
class Solution1: 
    def twoSum(self, nums: List[int], target: int) -> List[int]:
         for i in range(len(nums)):
            for j in range (i+1, len (nums)):
                if nums[i] + nums[j] == target:
                    return [i,j]

    
# 첫 번째 수를 뺀 결과 조회 
class Solution2:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # dictionary initialize
        nums_map = {}
        
        # key와 value를 바꿔서 dictionary로 저장
        for i, num in enumerate(nums):
            # 원소가 key값이 된다 
            nums_map[num] = i
        
        # target에서 첫 번째 수를 뺀 결과를 key로 조회
        for i, num in enumerate(nums):
            if target - num in nums_map and i != nums_map[target - num]:
                return [i, nums_map[target - num]]


# solution2를 하나의 for문으로 변경하기 
class Solution3:
    nums_map = {}
    for i , num in enumerate(nums) :
        if target - num = nums_map:
            return [nums_map[target - num], i]
        nums_map[num] = i



# in을 사용한 탐색 
class Solution4:
    # enumerate() : 인덱스, 원소를 동시에 접근 / compliment : 보어
    for i, n in enumerate(nums) :
        compliment = target - n
        
        if compliment in nums[i+1:]:
            return [nums.index(n),nums[i+1:].index(compliment) + (i+1)]
        



