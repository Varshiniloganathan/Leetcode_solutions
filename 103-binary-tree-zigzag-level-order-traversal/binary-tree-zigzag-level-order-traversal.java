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
    public List<List<Integer>> bfs(TreeNode root){
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return ans;
        q.add(root);
        boolean flag = false;
        while(!q.isEmpty()){
            int slen = q.size();
            List<Integer> row = new ArrayList<>();
            for(int i=0; i<slen; i++){
                TreeNode curr = q.poll();
                row.add(curr.val);
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            if(!flag){
                ans.add(row);
            }
            else{
                Collections.reverse(row);
                ans.add(row);
            }
            flag = !flag;
            
        }
        return ans;
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        return bfs(root);
    }
}