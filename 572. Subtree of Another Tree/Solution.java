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
    public boolean isIdentical(TreeNode s, TreeNode t) {
        if(s==null && t==null)
            return true;
        
        if(s==null && t!=null)
            return false;
        
        if(t==null && s!=null)
            return false;
        
        return s.val==t.val && 
            isIdentical(s.left,t.left) &&
            isIdentical(s.right,t.right);
    }
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(t==null)
            return true;
        if(s==null)
            return false;
        if(isIdentical(s,t))
            return true;
        return isSubtree(s.left,t) || isSubtree(s.right,t);
    }
}
