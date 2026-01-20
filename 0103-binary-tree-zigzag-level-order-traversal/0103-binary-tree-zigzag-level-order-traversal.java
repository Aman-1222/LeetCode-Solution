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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        boolean leftToRight = true;
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> lvl = new ArrayList<>();
            for (int k = 0; k < size; k++) 
               lvl.add(0); 
            for(int i=0;i<size;i++){
                TreeNode node = q.poll();
                // lvl.add(node.val);
                int index = (leftToRight)?i:size-i-1;
                lvl.set(index,node.val);
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            // if(!leftToRight) Collections.reverse(lvl);
            ans.add(lvl);
            leftToRight=!leftToRight;
        } 
        return ans;
    }
}