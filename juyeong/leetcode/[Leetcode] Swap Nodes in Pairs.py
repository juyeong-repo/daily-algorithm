# https://leetcode.com/problems/swap-nodes-in-pairs/submissions/
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def swapPairs(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        
        # 값만 스왑
        
        cur = head 
        
        while cur and cur.next :
            cur.val , cur.next.val = cur.next.val, cur.val
            cur = cur.next.next
            
        return head
        
        # 반복구조로 스왑, 재귀로 구현이 있지만.. 이해가 안가! 
        
        