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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        //step 1: add root to a queue
        //step 2: check while queue is not empty
        //          - get size of each level in each iteration
        //          - for each node at a level
        //          - remove current node from queue
        //          - add current node value to a temp list
        //          - if left and right child of current node exist, add them to queue
        //step 3: after existing inner for loop add temp list to final result list
        //step 4: return result
        
        List<List<Integer>> result=new LinkedList<>();
        
        if(root==null)
        {
            return result;
        }
        
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        
        while(q.size()>0)
        {
            int levelSize=q.size();
            List<Integer> temp=new LinkedList<>();
            
            for(int i=0; i<levelSize; i++)
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
        
        return result;
    }
}
