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
    public ListNode swapPairs(ListNode head) {
        
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        
        ListNode start=dummy;
        ListNode end=head;
        
        int count=0;
        
        while(end!=null)
        {
          count++;
            
          if(count%2==0)
          {
              start=reverse(start,end.next);
              end=start.next;
          }
          else
          {
              end=end.next;
          }
        }
        return dummy.next;
    }
    
    private ListNode reverse(ListNode start, ListNode end)
    {
        ListNode prev=start;
        ListNode curr=start.next;
        ListNode first=curr;
        
        while(curr!=end)
        {
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        
        start.next=prev;
        first.next=curr;
        
        return first;
    }
}
