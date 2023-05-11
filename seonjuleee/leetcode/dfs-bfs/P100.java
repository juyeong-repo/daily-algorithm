/**
 * 2023.05.10
 * 100. Same Tree
 * https://leetcode.com/problems/same-tree
 *
 * Site: Leetcode
 * Level: Easy
 * */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // 현재 노드 체크
        if(p == null && q == null) return true;
        else if(p == null || q == null) return false;

        // 다음 노드 방문
        if(p.val == q.val)
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

        else return false;
    }
}