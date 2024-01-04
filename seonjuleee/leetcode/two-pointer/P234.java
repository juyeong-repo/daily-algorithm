/**
 * 2023.11.13
 * 234. Palindrome Linked List
 * https://leetcode.com/problems/palindrome-linked-list
 *
 * Site: Leetcode
 * Level: Easy
 * */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int start = 0; int end = list.size()-1;
        while (start < end) {
            if (list.get(start) != list.get(end)) {
                return false;
            }
            start++; end--;
        }
        return true;
    }
}