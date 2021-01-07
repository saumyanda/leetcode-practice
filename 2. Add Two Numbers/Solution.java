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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int carry=0;
        ListNode result=new ListNode(0);
        ListNode head=result;
        
        if(l1==null)
        {
            return l2;
        }
        
        if(l2==null)
        {
            return l1;
        }
        
        while(l1!=null || l2!=null)
        {
            int l1_val=0;
            int l2_val=0;
            
            if(l1!=null)
            {
               l1_val=l1.val;
               l1=l1.next;
            }
            
            if(l2!=null)
            {
                l2_val=l2.val;
                l2=l2.next;
            }
            
            ListNode newNode=new ListNode((l1_val+l2_val+carry)%10);
            result.next=newNode;
            carry=(l1_val+l2_val+carry)/10;
            result=result.next;
        }
        
        if(carry>0)
        {
            ListNode newNode=new ListNode(carry);
            result.next=newNode;
        }
        
        return head.next;
        
        
    }
}
