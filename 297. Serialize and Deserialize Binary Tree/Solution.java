/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

/*
To serialize, we can simply do a DFS and append the node value to the string. 
We also need to encode null nodes, otherwise, we wouldn’t be able to tell if we have reached leaf nodes when we deserialize. 

We use x here as a placeholder for the null node.

To deserialize, we split the string into tokens and consume them. 
For each token, we create a new node using the token value. 
When we see an x, we know we have reached the leaf and should return.

The time complexity is O(N)O(N) since each node is visited once.

*/

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        
        StringBuilder result=new StringBuilder();
        serializeDFS(root,result);
        
        return result.toString();
        
    }
    
    private static void serializeDFS(TreeNode root, StringBuilder s)
    {
        if(root==null)
        {
            s.append("X");
            s.append(" ");
            return;
        }
        
        s.append(root.val);
        s.append(" ");
        serializeDFS(root.left,s);
        serializeDFS(root.right,s);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        
        return deserializeDFS(Arrays.stream(data.split(" ")).iterator());
        
    }
    
    private TreeNode deserializeDFS(Iterator<String> nodes)
    {
        String val=nodes.next();
        
        if(val.equals("X"))
        {
            return null;
        }
        
        TreeNode curr=new TreeNode(Integer.parseInt(val));
        curr.left=deserializeDFS(nodes);
        curr.right=deserializeDFS(nodes);
        
        return curr; 
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
