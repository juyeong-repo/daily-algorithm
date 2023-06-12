class Solution:
    def dailyTemperatures(self, T: List[int]) -> List[int]:
        # 기온이 주어진 배열 -> 더 따뜻해지는 날씨까지 몇일 ? 
        # 가능한 날이 없으면 0을 리턴 

        answer = [0] * len(T)
        stack = []

        for i, current in enumerate(T):
            # 현재 온도가 스택 값보다 높다면 정답처리
            while stack and current > T[stack[-1]] : #스택의 -1이면 맨위.
                last = stack.pop()
                answer[last] = i - last

            stack.append(i)


        return answer