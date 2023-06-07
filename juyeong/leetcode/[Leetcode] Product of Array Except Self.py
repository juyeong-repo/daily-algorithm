def productExceptSelf(self, nums: List[int]) -> List[int]:
    # 이중포문 돌렸을 때 timeout -> O(n^2)
    # 제대로 이해 못해서 다시 풂! 
    out = []
    p = 1
    
    # 왼쪽에 곱
    for i in range(0, len(nums)):
        out.append(p)
        p = p * nums[i]
    p = 1
    
    # 왼쪽 곱셈 결과에 오른쪽 값을 차례대로 곱셈
    for i in range(len(nums) - 1, 0 - 1, -1):
        out[i] = out[i] * p
        p = p * nums[i]
    return out

# leetcode : 238. Product of Array Except Self