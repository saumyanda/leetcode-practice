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
    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode root=new ListNode(0,head);
        ListNode current=head;
        ListNode prev=root;
    
        
        while(current!=null)
        {
            int listIndex=0;
            ListNode tail=current;
            while(current!=null && listIndex<k)
            {
                listIndex++;
                current=current.next;
            }
            
            if(listIndex!=k)
            {
                prev.next=tail;
            }
            else
            {
                prev.next=reverse(tail,k);
                prev=tail;
            }
        }
        
        return root.next;
    }
    
    private ListNode reverse(ListNode head, int k)
    {
        ListNode current=head;
        ListNode prev=null;
        ListNode next=null;
        
        while(current!=null && k>0)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
            k--;
        }
        
        return prev;
    }
}
