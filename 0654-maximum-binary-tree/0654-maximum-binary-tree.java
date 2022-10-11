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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        
        TreeNode root =  helper(nums, 0, nums.length - 1);
        return root;
    }
    
    public static TreeNode helper(int []arr, int lo, int hi)
        
    {
        if(lo > hi) return null;
        
        int curMax = lo;
        for(int i = lo + 1; i <= hi; i++)
        {
            if(arr[curMax] < arr[i])
            {
                curMax = i;
            }
        }
        
        TreeNode root = new TreeNode(arr[curMax]);
        root.left = helper(arr, lo, curMax - 1);
        root.right = helper(arr, curMax + 1, hi);
        
        return root;
       
        
       
    }
    
   
}