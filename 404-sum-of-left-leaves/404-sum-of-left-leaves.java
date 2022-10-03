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
    
    int leftLeavesSum = 0;
    
    public int sumOfLeftLeaves(TreeNode root) {
        
        if(root == null) return 0;
        
        helper(root);
        return leftLeavesSum;
    }
    
    private void helper(TreeNode root)
    {
        if(root == null) return;
        
        if(isLeaf(root.left))
        {
            leftLeavesSum += root.left.val;
        }
        
        helper(root.left);
        helper(root.right);
    }
    
    private boolean isLeaf(TreeNode root)
    {
        if(root == null) return false;
        
        if(root.left == null && root.right == null) return true;
        
        else return false;
    }
}