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
    
    int preIndex=0;
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
       return buildTreeRecursive(preorder, inorder, 0, preorder.length-1);   
        
    }
    
    public TreeNode buildTreeRecursive(int[] preorder, int[] inorder, int start, int end) {
        
       if(start>end)
       {
           return null;
       }
        
        
       TreeNode root=new TreeNode(preorder[preIndex++]);
        
        if(start==end)
        {
            return root;
        }
      
       int index=search(inorder,start,end,root.val);
        
       root.left=buildTreeRecursive(preorder,inorder,start,index-1);
       root.right=buildTreeRecursive(preorder,inorder,index+1,end);
        
        return root;
    }
    
    public int search(int[] arr, int start, int end, int val)
    {
        for(int i=start;i<=end;i++)
        {
            if(arr[i]==val)
            {
                return i;
            }
        }
        return -1;
    }
}
