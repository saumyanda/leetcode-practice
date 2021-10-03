/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    
    public Node() {
        children = new ArrayList<Node>();
    }
    
    public Node(int _val) {
        val = _val;
        children = new ArrayList<Node>();
    }
    
    public Node(int _val,ArrayList<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    /*
    In the first iteration, we traverse each node in the list, we add the value of the node to the value_sum. Moreover, we deduct the value of its child nodes from the value_sum.

At the end of the first iteration, the value_sum would become the value of the root node, as we discussed before.

Once we know the value of the root node, i.e. value_sum, we can run a second iteration on the list to find out the root node.
    */
    public Node findRoot(List<Node> tree) {
        /*
        The idea is that we use an integer (value_sum) to keep track of the sum of node values. More specifically, we add the value of each node to value_sum and we deduct the value of each child node from the value_sum. At the end, the value_sum would be the value of the root node.
        */
        Integer valueSum = 0;

        for (Node node : tree) {
            // the value is added as a parent node
            valueSum += node.val;
            for (Node child : node.children)
                // the value is deducted as a child node.
                valueSum -= child.val;
        }

        Node root = null;
        // the value of the root node is `valueSum`
        for (Node node : tree) {
            if (node.val == valueSum) {
                root = node;
                break;
            }
        }
        return root;
    }
}
