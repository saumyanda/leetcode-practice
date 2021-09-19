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
        
       //base case - without recursion
        if(root==null)
        {
            return root;
        }
        
        //swap left and right children
        TreeNode temp=root.right;
        root.right=root.left;
        root.left=temp;
        
        //invert child Trees recursively
        TreeNode left=invertTree(root.left);
        TreeNode right=invertTree(root.right);
        
         return root;
    }
    
}
