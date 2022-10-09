/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        // this is Binary Tree method
        
        /*
        if(root == null) return null;        
        if(root.val == p.val || root.val == q.val) return root;
        
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        
        if(left == null) return right;
        if(right == null) return left;
        
        return root;
        
        */
        
        // this is binary search tree method.
        
        if(root == null) return null;
        
        if(p.val < root.val && q.val < root.val)
        {
            return lowestCommonAncestor(root.left, p, q);
        }
        
        if(p.val > root.val && q.val > root.val)
        {
            return lowestCommonAncestor(root.right, p, q);
        }
        
        return root;
    }
}