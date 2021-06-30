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
    
    //Finds the path from root node to given root of the tree
    //if path exists return true, else return false
    private boolean findPath(TreeNode root, int n, List<TreeNode> path)
    {
        // base case
        if(root==null)
        {
            return false;
        }
        
        //store this node 
        //the node will be removed if not in path from root to n
        path.add(root);
        if(root.val==n)
        {
            return true;
        }
        
        if(root.left!=null && findPath(root.left,n,path))
        {
            return true;
        }
        
        if(root.right!=null && findPath(root.right,n,path))
        {
            return true;
        }
        
        //if not present in subtree rooted with root, 
        //remove root from path[] and return false
        path.remove(path.size()-1);
        return false;
    }
    
    //find path from root to p store in list pathp
    //find path from root to q store in list listq
    //traverse both paths till the values in arrays are the same
    //return the common element just before the mismatch
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
      
        List<TreeNode> pathp=new LinkedList<>();
        
        List<TreeNode> pathq=new LinkedList<>();
        
        if(!findPath(root,p.val,pathp) || !findPath(root,q.val,pathq))
            return null;
        
        List<TreeNode> common=new LinkedList<>();
        
        int i=0,j=0;
        
        while(i<pathp.size() && j<pathq.size())
        {
            if(pathp.get(i).val!=pathq.get(j).val)
            {
               break;
            }
            
            i++;
            j++;
        }
        
        return pathp.get(i-1);
    }
}
