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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> average=new LinkedList<>();
        
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        
        double sum=0;
        int count=0;
        
        while(!queue.isEmpty())
        {
            sum=0;
            count=0;
            Queue<TreeNode> temp=new LinkedList<>();
            while(!queue.isEmpty())
            {
                TreeNode current=queue.remove();
                sum+=current.val;
                count++;
                 if(current.left!=null)
                 {
                    temp.add(current.left);
                 }
            
                 if(current.right!=null)
                 {
                    temp.add(current.right);
                 }
            }
            queue=temp;
            
            average.add(sum/count);
        }
        
        return average;
        
    }
}
