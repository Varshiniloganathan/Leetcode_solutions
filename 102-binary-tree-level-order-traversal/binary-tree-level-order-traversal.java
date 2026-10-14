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

    public List<List<Integer>> bfs(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return ans;
        q.add(root);

        while (!q.isEmpty()) {
            int qlen = q.size();
            List<Integer> row = new ArrayList<>();
            for (int i = 0; i < qlen; i++) {
                TreeNode r = q.poll();
                row.add(r.val);
                if (r.left != null) {
                    q.add(r.left);
                }
                if (r.right != null) {
                    q.add(r.right);
                }
            }
            ans.add(row);

        }
        return ans;

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        return bfs(root);

    }
}