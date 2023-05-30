/**
 * 2023.05.31
 * 337. House Robber III
 * https://leetcode.com/problems/house-robber-iii
 *
 * Site: Leetcode
 * Level: Medium
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
    public int[] dfs(TreeNode node) {
        if (node == null) {
            return new int[] {0, 0};
        }

        int[] result = new int[2];
        int[] left = dfs(node.left);
        int[] right = dfs(node.right);

        result[0] = node.val + left[1] + right[1]; // 자신 포함
        result[1] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]); // 자신 포함 X

        return result;
    }
    public int rob(TreeNode root) {
        if (root == null) return 0;
        int[] result = dfs(root);
        return Math.max(result[0], result[1]);
    }
}