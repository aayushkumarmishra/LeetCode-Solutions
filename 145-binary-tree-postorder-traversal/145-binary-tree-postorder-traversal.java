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
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> postorder = new ArrayList<Integer>();
        
        if(root == null)
        {
            return postorder;
        }
        
        Stack<TreeNode> str1 = new Stack<TreeNode>();
        Stack<TreeNode> str2 = new Stack<TreeNode>();
        
        str1.push(root);
        
        while(!str1.isEmpty())
        {
            root = str1.pop();
            str2.add(root);
            
            if(root.left != null)
            {
                str1.push(root.left);
            }
            
            if(root.right != null)
            {
                str1.push(root.right);
            }
        }
        
        while(!str2.isEmpty())
        {
            postorder.add(str2.pop().val);
        }
        
        return postorder;
    }
}