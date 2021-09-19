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
        //bfs based solution
        //swap nodes on every level while doing a bfs traversal
       if(root==null)
           return root;
        
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        
        while(q.size()>0)
        {
            TreeNode current=q.poll();
            
            //swap children of current node
            TreeNode temp=current.left;
            current.left=current.right;
            current.right=temp;
            
            //if current node has left child add to queue
            if(current.left!=null)
            {
                q.offer(current.left);
            }
            
            //if current node has right child add to queue
            if(current.right!=null)
            {
                q.offer(current.right);
            }
        }
           
        return root;
    }
    
}
