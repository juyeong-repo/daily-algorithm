class Solution(object):
    def maxProfit(self, prices):
        result = 0
        # 값이 오르는 경우 매번 그리디 계산하여 최소/최대값 계속 갱신
        for i in range(len(prices) - 1):
            if prices[i + 1] > prices[i]:
                result += prices[i + 1] - prices[i]
        return result