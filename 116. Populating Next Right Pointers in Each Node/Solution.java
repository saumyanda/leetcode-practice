/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        
        if(root==null)
        {
            return root;
        }
        
        //Start with the root node
        Node leftnode=root;
        
        //Keep going left
        //because each level can be traversed by starting at the left most node
        while(leftnode.left!=null)
        {
            //Each level itself is like a linkedlist with a next pointer
            Node head=leftnode;
            
            //Iterate through the list and set the next pointers
            //at every level we setup next pointers for the next level
            //so each node sets up next pointers for it's left and right child
    //assumption: next pointers are set for the level above before proceeding to next level
            while(head!=null)
            {
                //connection 1
                //when the nodes share a common parent
                head.left.next=head.right;
                
                //connection 2:
                //when the nodes share a different parent
                if(head.next!=null)
                {
                    head.right.next=head.next.left;
                }
                
                head=head.next;
            }
            
            leftnode=leftnode.left;
        }
        
        return root;
    }
}
