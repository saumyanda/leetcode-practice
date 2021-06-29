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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       
        Queue<TreeNode> q=new LinkedList<>();
        
        List<List<Integer>> result=new LinkedList<>();
        
        if(root==null)
        {
            return result;
        }
        
        q.offer(root);
        
        while(q.size()>0)
        {
            int levelsize=q.size();
            List<Integer> temp=new LinkedList<>();
            
            for(int i=0;i<levelsize;i++)
            {
                 TreeNode current=q.poll();
                 temp.add(current.val);
                       
                   if(current.left!=null)
                   {
                       q.offer(current.left);
                   }
                   
                   if(current.right!=null)
                   {
                     q.offer(current.right);  
                   }
            }
            
            result.add(temp);
        }
        
        List<List<Integer>> result1=new LinkedList<>();
        
        for(int j=0; j<result.size();j++)
        {
            List<Integer> temp1=new LinkedList<>();
            if(j%2!=0)
            {
              Stack<Integer> s=new Stack<>();
                
              for(int k=0; k<result.get(j).size(); k++)
              {
                  s.push(result.get(j).get(k));
              }
            
              while(!s.empty())
              {
                  temp1.add(s.pop());
              }
                result1.add(temp1);
            }
            else
            {
                result1.add(result.get(j));
            }
        }
        
       return result1; 
    }
}
