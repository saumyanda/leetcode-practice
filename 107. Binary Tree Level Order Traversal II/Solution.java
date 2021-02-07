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
    
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        List<List<Integer>> result=new LinkedList<>();
        
        Stack<List<Integer>> resultstack=new Stack<>();
        
        if(root==null)
            return result;
        
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        
        q.offer(root);
        
        while(!q.isEmpty())
        {
            LinkedList<Integer> level=new LinkedList<Integer>();
            int queuesize=q.size();
            
            for(int i=0;i<queuesize;i++)
            {
                TreeNode node=q.poll();
                level.add(node.val);
                
               if(node.left!=null)
               {
                   q.offer(node.left);
               }
                if(node.right!=null)
                {
                    q.offer(node.right);
                }
            }
            resultstack.push(level);
        }
        
        while(!resultstack.empty())
        {
            result.add(resultstack.pop());
        }
        return result;
    }
}
