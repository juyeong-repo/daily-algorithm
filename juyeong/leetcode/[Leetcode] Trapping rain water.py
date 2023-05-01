# 출처: https://leetcode.com/problems/trapping-rain-water/
class Solution:
    def trap(self, height: List[int]) -> int:
        # Using two pointer 
        
        if not height:
            return 0
        
        volume = 0
        
        # design left pointer and right pointer 
        left, right = 0, len(height) - 1
        left_max, right_max = height[left] , height[right]
        
        # when right is bigger than left 
        while left < right:
            left_max , right_max = max(height[left], left_max),max(height[right], right_max)
            
            # move to higher inflection point_ which pointer should be move?
            if left_max <= right_max:
                volume += left_max - height[left]
                left += 1
            else:
                volume += right_max - height[right]
                right -= 1
            
        return volume
        