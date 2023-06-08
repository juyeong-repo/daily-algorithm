# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseBetween(self, head: Optional[ListNode], m: int, n: int) -> Optional[ListNode]:
        
        # 역순으로 뒤집어야 한다. 인덱스 left to right을 뒤집기
        # 반복 사용해서 푸는 것만 떠오르는데, 시간 복잡도가 .. 이거 맞나
        # 우선 해보자
        
        # 예외처리
        if not head or m == n:
            return head
        
        root = start = ListNode(None)
        root.next = head
        
        # start, end 지정
        for _ in range(m-1):
            start = start.next
        end = start.next
        
        # 반복하면서 노드 뒤집기
        for _ in range(n-m):
            tmp, start.next ,end.next = start.next , end.next, end.next.next
            start.next.next = tmp
        return root.next