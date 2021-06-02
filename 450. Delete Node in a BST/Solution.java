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
    public TreeNode deleteNode(TreeNode root, int key) {
       
        if(root==null)
            return root;
        
        //Search the key in the tree
        if(key<root.val)
        {
            root.left=deleteNode(root.left,key);
        }
        else if(key>root.val)
        {
            root.right=deleteNode(root.right,key);
        }
        
        //If the key is found, this is the node to be deleted
        else
        {
            //if the node to be deleted has a single child
            //replace the deleted node with the left or right child
            if(root.left==null)
            {
                return root.right;
            }
            else if(root.right==null)
            {
                return root.left;
            }
            
            //if the node to be deleted has both left and right child
            //replace the deleted node with the inorder successor
            //(minmimum value in right subtree) of the node
            else
            {
                root.val=minValue(root.right);
                root.right=deleteNode(root.right,root.val);
            }
        }
        return root;
    }
    
    private int minValue(TreeNode root)
    {
        int min=root.val;
        
        if(root.left!=null)
        while(root.left!=null)
        {
            min=Math.min(min,root.left.val);
            root=root.left;
        }
        
        return min;
    }
}
