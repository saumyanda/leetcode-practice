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
  With BFS, since we search level by level, we are guaranteed to find the shallowest leaf node earlier than other leaf nodes. 
  The time complexity is O(N) since each node is visited at most once.
  */
  
    public int minDepth(TreeNode root) {
        int depth=0;

        if(root==null)
        {
            return depth;
        }

        Queue<TreeNode> q=new LinkedList<>();

        q.offer(root);

        while(q.size()>0)
        {
            depth++;
            int n=q.size();
           
            for(int i=0;i<n;i++)
            {
                TreeNode current=q.poll();

                if(current.left==null && current.right==null)
                {
                    return depth;
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

        }

        return depth;
    }
}
