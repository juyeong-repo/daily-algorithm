# LINK : https://leetcode.com/problems/two-sum/
# 4가지 방식으로 풀이 가능


# Brute force
class Solution1: 
    def twoSum(self, nums: List[int], target: int) -> List[int]:
         for i in range(len(nums)):
            for j in range (i+1, len (nums)):
                if nums[i] + nums[j] == target:
                    return [i,j]


class Solution3:
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
