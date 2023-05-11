/**
 * 2023.05.11
 * 104. Maximum Depth of Binary Tree
 * https://leetcode.com/problems/maximum-depth-of-binary-tree
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
    public int dfs(TreeNode node) {
        if (node == null) { return 0; }
        int l = dfs(node.left);
        int r = dfs(node.right);
        return Math.max(l, r) + 1;
    }
    public int maxDepth(TreeNode root) {
        return dfs(root);
    }
}