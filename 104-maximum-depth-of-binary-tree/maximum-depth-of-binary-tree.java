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
    public int recur(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftsub = 1 + recur(root.left);
        int rightsub = 1 + recur(root.right);
        return Math.max(leftsub,rightsub);
        

    }
    public int maxDepth(TreeNode root) {
        return recur(root);
    }
}