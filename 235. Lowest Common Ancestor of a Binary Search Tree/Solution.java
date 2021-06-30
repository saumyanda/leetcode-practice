/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    //The function assumes that both p and q are present in BST
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

         // If both p and q are smaller than root, then LCA lies in left
        if(p.val<root.val && q.val<root.val)
        {
            root=lowestCommonAncestor(root.left,p,q);
        }
        
         // If both p and q are larger than root, then LCA lies in right
        if(p.val>root.val && q.val>root.val)
        {
            root=lowestCommonAncestor(root.right,p,q);
        }
        
        //If both the above cases are false then return the current node as LCA
        return root;
        
    }
}
