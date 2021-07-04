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
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> res = new ArrayList<>();
        
        if(root==null)
        {
            return res;
        }
      
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        //We can do a level order traversal and add the last node to return the result. 
        //The time complexity is O(N) since each node is visited at most once
        while(q.size()>0)
        {
            int n=q.size();

            TreeNode right=null;

            for(int i=0;i<n;i++)
            {
                TreeNode current=q.poll();

                if(i==n-1)
                {
                    right=current;
                }

                if(current.left!=null)
                {
                    q.offer(current.left);
                }

                if(current.right!=null)
                {
                    q.offer(current.right);
                }
            }
            res.add(right.val);
        }

        return res;
    }
}
