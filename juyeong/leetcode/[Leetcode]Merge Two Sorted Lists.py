# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
# https://leetcode.com/problems/merge-two-sorted-lists/submissions/
class Solution:
    def mergeTwoLists(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        
        if (not l1) or (l2 and l1.val > l2.val) :
            l1, l2 = l2, l1
        if l1:
            l1.next = self.mergeTwoLists (l1.next, l2)
        return l1

# https://www.youtube.com/watch?v=XIdigk956u0
# 위 방식과 성능차이를 이해하는 것 필요
class Solution:
    def mergeTwoLists2(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        
        dummy = ListNode()
        tail = dummy

        while l1 and l2:
            if l1.val < l2.val:
                tail.next = l1
                l1 = l1.next
            else:
                tail.next = l2
                l2 = l2.next 
            tail = tail.next

        if l1:
            tail.next = l1
        elif l2:
            tail.next = l2

        return dummy.next