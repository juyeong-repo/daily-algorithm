# https://leetcode.com/problems/design-circular-queue/submissions/

class MyCircularQueue:

    def __init__(self, k: int):
        #배열 초기화 
        self.q = [None] * k
        self.maxlen = k
        self.p1 = 0 #front 포인터
        self.p2 = 0 #rear 포인터

    def enQueue(self, value: int) -> bool:
        # 요소 삽입 (rear 포인터 사용)
        if self.q[self.p2] is None:
            self.q[self.p2] = value
            #포인터의 위치가 배열을 벗어나지 않도록 한다
            self.p2 = (self.p2 + 1) % self.maxlen
            return True
        else:
            return False #배열이 꽉찬경우이므로 false

    def deQueue(self) -> bool:
        # 요소 삭제 (front 포인터 사용)
        if self.q[self.p1] is None:
            return False
        else:
            # p1에 None을 넣어 삭제
            self.q[self.p1] = None
            self.p1 = (self.p1 + 1) % self.maxlen
            return True

        
    def Front(self) -> int:
        return -1 if self.q[self.p1] is None else self.q[self.p1]

    def Rear(self) -> int:
        return -1 if self.q[self.p2 - 1] is None else self.q[self.p2 - 1]

        
    def isEmpty(self) -> bool:
        return self.p1 == self.p2 and self.q[self.p1] is None

    def isFull(self) -> bool:
        return self.p1 == self.p2 and self.q[self.p1] is not None


# Your MyCircularQueue object will be instantiated and called as such:
# obj = MyCircularQueue(k)
# param_1 = obj.enQueue(value)
# param_2 = obj.deQueue()
# param_3 = obj.Front()
# param_4 = obj.Rear()
# param_5 = obj.isEmpty()
# param_6 = obj.isFull()s