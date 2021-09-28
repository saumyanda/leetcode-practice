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
//https://youtu.be/CvrPf1-flAA
class Solution {
    public int countNodes(TreeNode root) {
        
        if(root==null)
        {
            return 0;
        }
        
        //Taking advantage of the fact that the tree is a complete binary tree
        //A complete binary tree has all levels filled except the last
        //If the depth of tree is d then d-1 levels have 2^(d-1) - 1 nodes
        //The last level can have 1 to 2^d nodes
        
        //calculate the left extreme level
        int left_level=1;
        TreeNode temp1=root;
        while(temp1.left!=null)
        {
            temp1=temp1.left;
            left_level++;
        }
        
        //calculate the right extreme level
        int right_level=1;
        TreeNode temp2=root;
        while(temp2.right!=null)
        {
            temp2=temp2.right;
            right_level++;
        }
        
        System.out.println(left_level+"\t"+right_level);
        //if the tree is a complete binary tree then simply
        //return total number of nodes in complete binary tree 2^d - 1
        //where d is the depth of the tree starting from 1
        if(left_level==right_level)
            return (int)Math.pow(2,left_level) - 1;
        
        return 1+countNodes(root.left)+countNodes(root.right);
        
    }
}
