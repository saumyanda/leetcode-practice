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
    //For each node, check if max value in left subtree is smaller 
    //than the node and min value in right subtree greater than the node
    public boolean isValidBST(TreeNode root) {
       
        if(root==null)
            return true;
        
        if(root.left!=null && maxValue(root.left)>=root.val)
            return false;
        
        if(root.right!=null && minValue(root.right)<=root.val)
            return false;
        
        if(!isValidBST(root.left) || !isValidBST(root.right))
            return false;
        
        return true;
    }
    
    private int maxValue(TreeNode root)
    {
        if(root==null)
            return 0;
        
        TreeNode temp=root;
        if(temp.right!=null)
        while(temp.right!=null)
        {
            temp=temp.right;
        }
        return temp.val;
    }
    
     private int minValue(TreeNode root)
    {
        if(root==null)
            return 0;
        
        TreeNode temp=root;
        if(temp.left!=null)
        while(temp.left!=null)
        {
            temp=temp.left;
        }
        return temp.val;
    }
}
