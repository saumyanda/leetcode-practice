/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
       ListNode temp=head,prev=null;
        
        // If head node itself holds the key or multiple occurrences of key
        while(temp!=null && temp.val==val)
        {
            head=temp.next;
            temp=head;
        }
        
        
        // Delete occurrences other than head
        while(temp!=null)
        {
            // Search for the key to be deleted,
            // keep track of the previous node
            // as we need to change 'prev->next'
            while(temp!=null && temp.val!=val)
            {
                prev=temp;
                temp=temp.next;
            }
            
            // If key was not present in linked list
            if(temp==null)
                break;
            
            // Unlink the node from linked list
            prev.next=temp.next;
            
            // Update Temp for next iteration of outer loop
            temp=prev.next;
        }
        
        return head;
    }
}
