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
    /*
    problem is almost the same as level order traversal. 
    We just have to keep a flag to track if we are currently traversing 
    left-to-right or right-to-left.
    */
    
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> result=new LinkedList<>();
        
        if(root==null)
        {
            return result;
        }
        
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        
        boolean leftToRight=true;
        while(q.size()>0)
        {
            int n=q.size();
            List<Integer> level=new LinkedList<>();
            
            for(int i=0;i<n;i++)
            {
                 TreeNode current=q.poll();
                 level.add(current.val);
                       
                   if(current.left!=null)
                   {
                       q.offer(current.left);
                   }
                   
                   if(current.right!=null)
                   {
                     q.offer(current.right);  
                   }
            }
            if(!leftToRight)
            {
                Collections.reverse(level);
            }
            result.add(level);
            leftToRight=!leftToRight;
        }
        
        return result;
    }
}
