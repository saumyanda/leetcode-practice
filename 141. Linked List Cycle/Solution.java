/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
       
       ListNode temp=head;
        
       HashSet<ListNode> s = new HashSet<ListNode>();
        
       while(temp!=null)
       {
           if(s.contains(temp))
           {
               return true;
           }
           s.add(temp);
           temp=temp.next;
       }
       return false;
    }
}
