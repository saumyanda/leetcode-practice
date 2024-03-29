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
    
    
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> result=new ArrayList<Integer>();
        
       if(root==null)
            return result;
        
        if(root!=null)
        {
        if(root.left!=null)
        result.addAll(inorderTraversal(root.left));
        
        result.add(root.val);
        
        if(root.right!=null)
        result.addAll(inorderTraversal(root.right));
        }
        
        return result;
        
    }
}
