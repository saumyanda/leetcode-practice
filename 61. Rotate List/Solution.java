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
    public ListNode rotateRight(ListNode head, int k) {
     
        if(head==null || head.next==null)
        {
            return head;
        }
        
        int counter=1;
        
        while(k!=0)
        {
            ListNode curr=head;
            ListNode prevCurr=head;
            
            while(curr.next!=null)
            {
                curr=curr.next;
                counter++;
            }
            
            if(k % counter == 0)
            {
                return head;
            }
            else if(k > counter && k % counter != 0)
            {
                k %= counter;
                k--;
            }
            else
            {
                k--;
            }
            
            while(prevCurr.next.next!=null)
            {
                prevCurr=prevCurr.next;
            }
            
            ListNode temp=curr;
            prevCurr.next=null;
            temp.next=head;
            head=temp;
        }
        
        return head;
    }
}
