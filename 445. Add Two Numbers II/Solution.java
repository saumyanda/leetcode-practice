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
    public ListNode reverse(ListNode head)
    {
        ListNode curr=head;
        ListNode prev=null;
        ListNode next=null;
        
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode t1=l1,t2=l2;
        
        /*
        Insert 0 infront of shorter list
        */
    
        while(t1!=null || t2!=null)
        {
            if(t1==null)
            {
                ListNode temp1=new ListNode(0);
                temp1.next=l1;
                l1=temp1;
            }
            
            if(t2==null)
            {
                ListNode temp2=new ListNode(0);
                temp2.next=l2;
                l2=temp2;
            }
            
            if(t1!=null)
            {
                t1=t1.next;
            }
            
            if(t2!=null)
            {
                t2=t2.next;
            }
            
        }
        
        /*
        Reverse both lists
        */
        l1=reverse(l1);
        l2=reverse(l2);
        
        ListNode temp1=l1,temp2=l2;
        int sum, carry=0;
        ListNode result=null;
        ListNode temp=null;
        ListNode prev=null;
        
        while(temp1!=null && temp2!=null)
        {
            sum=carry+temp1.val+temp2.val;
            
            if(sum >= 10){
                sum=sum%10;
                carry=1;
            }
            else
            {
                carry=0;
            }
            
            temp=new ListNode(sum);
            
            if(result==null)
            {
                result=temp;
            }
            else
            {
                prev.next=temp;
            }
            
            prev=temp;
            
            temp1=temp1.next;
            temp2=temp2.next;
          
            if(carry>0)
            {
                temp.next=new ListNode(carry);
            }
        }
        
        //reverse the returned list
        return reverse(result);
         
    }
}
