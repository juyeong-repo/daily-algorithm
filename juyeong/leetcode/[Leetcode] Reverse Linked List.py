# https://leetcode.com/problems/reverse-linked-list/

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # 재귀구조, 반복구조 2가지로 풀이 -> recursive 이해가 잘 안갔다ㅠㅠ 그래도 우선 킵고잉
        # 첫 노드를 헤드로, 이전 노드는 none
        node, prev = head, None
        
        # 노드가 존재하는 동안 : none이 될 때까지
        while node: 
            # 앞 뒤 위치 스왑해 
            next, node.next = node.next, prev
            prev, node = node , next
            
        return prev
            