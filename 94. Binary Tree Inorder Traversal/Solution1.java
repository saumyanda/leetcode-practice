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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        TreeNode current=root;
        
        List<Integer> res=new LinkedList<>();
        Stack<TreeNode> st=new Stack<>();
        
        while(current!=null || !st.empty())
        {
            while(current!=null)
            {
                st.push(current);
                current=current.left;
            }
            
            current=st.pop();
            res.add(current.val);
            current=current.right;
        }
        
        return res;
    }
}
