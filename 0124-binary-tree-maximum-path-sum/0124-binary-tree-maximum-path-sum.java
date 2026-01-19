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
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        sum(root);
        return max;
    }

    public int sum(TreeNode root){
        if(root==null) return 0;
        int leftSum = Math.max(sum(root.left),0);
        int rightSum = Math.max(sum(root.right),0);
        max = Math.max(leftSum+rightSum+root.val,max);
        return root.val+Math.max(leftSum,rightSum);
    }
}