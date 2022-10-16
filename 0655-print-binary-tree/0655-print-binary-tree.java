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
    public List<List<String>> printTree(TreeNode root) {
        
        int height = getHeight(root), col = (int)Math.pow(2, height)-1;;
        List<List<String>> res = new ArrayList();
        List<String> row = new ArrayList();
        for(int i = 0; i < col; i++) row.add("");
        for(int i = 0; i < height; i++)  res.add(new ArrayList(row));
        initialize(res, root, 0, 0, col-1);
        return res;
    }
    public void initialize(List<List<String>> res, TreeNode root, int curRow, int colBegin, int colEnd) {
        if(root == null) return;
        res.get(curRow).set((colBegin+colEnd)/2, String.valueOf(root.val));
        initialize(res, root.left, curRow+1, colBegin, (colBegin+colEnd)/2-1);
        initialize(res, root.right, curRow+1, (colBegin+colEnd)/2+1, colEnd);
    }
    public int getHeight(TreeNode root) {
        if(root == null)
            return 0;
         return 1+Math.max(getHeight(root.left), getHeight(root.right));
    }
}