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
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        boolean result=true;
        Stack<Integer> st=new Stack<Integer>();
        
        while(temp!=null)
        {
            st.push(temp.val);
            temp=temp.next;
        }
        
        temp=head;
        
        while(temp!=null)
        {
            int i=st.pop();
            if(temp.val==i)
            {
                result=true;
            }
            else
            {
                result=false;
                break;
            }
            
            temp=temp.next;
        }
        return result;
    }
}
