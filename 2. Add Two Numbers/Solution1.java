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
        
        //https://www.youtube.com/watch?v=zaJhgYbN9h0
       ListNode head1=l1;
       ListNode head2=l2;
        
       ListNode dummy=new ListNode(0);
       ListNode head=dummy;
        
    boolean hasCarry=false;
        
       while(head1!=null || head2!=null)
       {
         int sum=0;
           
          if(head1==null)
          {
              sum+=head2.val;
              head2=head2.next;
          }
          else if(head2==null)
          {
              sum+=head1.val;
              head1=head1.next;
          }
           else
           {
               sum+=head1.val+head2.val;
               head1=head1.next;
               head2=head2.next;
           }
           
          if(hasCarry)
          {
              sum++;
          }
           
          if(sum>=10)
          {
              sum=sum%10;
              hasCarry=true;
          }
           else
           {
               hasCarry=false;
           }
           
           head.next=new ListNode(sum);
           head=head.next;
       }
        
        if(hasCarry)
        {
            head.next=new ListNode(1);
        }
       
        return dummy.next;
    }
}
