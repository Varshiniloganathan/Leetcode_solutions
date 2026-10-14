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
    public List<Integer> recur(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return ans;
        q.add(root);
        while(!q.isEmpty()){
            int qlen = q.size();
            TreeNode value = q.peek();
            ans.add(value.val);
            for(int i=0; i<qlen; i++){
                TreeNode curr = q.poll();
                if(curr.right != null){
                    q.add(curr.right);
                }
                if(curr.left != null){
                    q.add(curr.left);
                }
            }
        }
        return ans;
    }
    public List<Integer> rightSideView(TreeNode root) {
        return recur(root);

        
    }
}