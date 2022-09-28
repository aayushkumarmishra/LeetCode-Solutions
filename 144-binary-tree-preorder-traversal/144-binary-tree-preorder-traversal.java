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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> preorder = new ArrayList<Integer>();
        
        if(root == null)
        {
            return preorder;
        }
        
        Stack<TreeNode> str = new Stack<TreeNode>();
        
        str.push(root);
        
        while(!str.isEmpty())
        {
            TreeNode temp = str.peek();
            str.pop();
            
            preorder.add(temp.val);
            
            
            if(temp.right != null)
            {
                str.push(temp.right);
            }
            
            if(temp.left != null)
            {
                str.push(temp.left);
            }
        }
        
        return preorder;
        
    }
}