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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        //https://youtu.be/aaSFzFfOQ0o
        //Process the tree bottom up because when trying to go top-down
        //deletion of a node can lose it's child references
        List<TreeNode> result=new LinkedList<>();
        
        Set<Integer> toDeleteSet=new HashSet<>();
        
        for(int i:to_delete)
        {
            toDeleteSet.add(i);
        }
        
        //add root to result if it's not in toDeleteSet
        if(!toDeleteSet.contains(root.val))
        {
            result.add(root);
        }
        removeNodes(root,toDeleteSet,result);
        
        return result;
    }
    
    public TreeNode removeNodes(TreeNode root, Set<Integer> toDeleteSet, List<TreeNode> result)
    {
        
        //base case-start from the bottom of the tree below the leaves
        if(root==null)
        {
            return null;
        }
        
        root.left=removeNodes(root.left,toDeleteSet,result);
        root.right=removeNodes(root.right,toDeleteSet,result);
        
        if(toDeleteSet.contains(root.val))
        {
            //make sure to preserve left and right child nodes of the node to be deleted
            if(root.left!=null)
            {
                result.add(root.left);
            }
            if(root.right!=null)
            {
                result.add(root.right);
            }
            //if left and right children are null then delete the node and return null
            return null;
        }
        
        return root;
    }
}
