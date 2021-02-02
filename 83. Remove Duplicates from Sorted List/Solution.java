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
    
    public ListNode deleteDuplicates(ListNode head) {
      
        ListNode prev=head,temp=head;
        
        while(temp!=null)
        {
            if(temp.val!=prev.val)
            {
                prev.next=temp;
                prev=temp;
            }
            temp=temp.next;
        }
        
       //multiple occurences of last element
        if(prev!=temp)
        {
            prev.next=null;
        }
        
        return head;
        
    }
}
