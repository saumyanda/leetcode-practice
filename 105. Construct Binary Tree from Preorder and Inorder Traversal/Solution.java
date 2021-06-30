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
    //https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/discuss/34538/My-Accepted-Java-Solution
    
    /*
    Our aim is to find out the index of right child for current node in the preorder array
    
We know the index of current node in the preorder array - preStart, it's the root of a subtree
Remember pre order traversal always visit all the node on left branch before going to the right 
( root -> left -> ... -> right), therefore, we can get the immediate right child index by skipping all the node on the left branches/subtrees of current node

The inorder array has this information exactly. Remember when we found the root in "inorder" array we immediately know how many nodes are on the left subtree and how many are on the right subtree
Therefore the immediate right child index is preStart + numsOnLeft + 1 (remember in preorder traversal array root is always ahead of children nodes but you don't know which one is the left child which one is the right, and this is why we need inorder array)
numsOnLeft = root - inStart.
    */
    
    private TreeNode buildTreeRecursive(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder)
    {
        if(preStart>preorder.length-1 || inEnd < inStart)
        {
            return null;
        }
        
        TreeNode root=new TreeNode(preorder[preStart]);
        
        int inIndex=0; // Index of current root in inorder
        
        for(int i=inStart;i<=inEnd;i++)
        {
            if(inorder[i]==root.val)
            {
                inIndex=i;
            }
        }
        
        root.left=buildTreeRecursive(preStart+1, inStart, inIndex-1, preorder, inorder);
        root.right=buildTreeRecursive(preStart+inIndex-inStart+1, inIndex+1, inEnd, preorder, inorder);
        
        return root;
        
    }
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        return buildTreeRecursive(0,0,inorder.length-1,preorder,inorder);
        
    }
}
