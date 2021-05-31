/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

/*
1. Traverse the original linked list and make a copy in terms of data.
2. Make a hash map of key value pair with original linked list node and copied linked list node.
3. Traverse the original linked list again and using the hash map adjust the next and random reference of cloned linked list nodes.
*/
class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)
        {
            return head;
        }
        Node dummy=new Node(0);
        
        dummy.next=head;
        
        HashMap<Node,Node> map=new HashMap<>();
        while(head!=null)
        {
           map.put(head,new Node(head.val));
           head=head.next;
        }
        head=dummy.next;
        while(head!=null)
        {
            Node newnode=map.get(head);
            newnode.next=map.get(head.next);
            newnode.random=map.get(head.random);
            head=head.next;
        }
        return map.get(dummy.next); 
    }
}
