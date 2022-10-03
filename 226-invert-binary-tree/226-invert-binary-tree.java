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
    public TreeNode invertTree(TreeNode root) {
        
        // This is recrusive method.
        
        /*if(root == null) return null;
        
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        invertTree(root.left);
        invertTree(root.right);
        
        return root;
        */
        
        // This Irtative Method.
        if(root == null) return null;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        
        q.offer(root);
        
        while(!q.isEmpty())
        {
            TreeNode node = q.poll();
            
            if(node != null)
            {
                q.offer(node.left);
                q.offer(node.right);
                
                TreeNode temp = node.left;                
                node.left = node.right;                
                node.right = temp;
            }
            
        }
        return root;
        
    }
}