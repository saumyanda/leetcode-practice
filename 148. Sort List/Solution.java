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
    public ListNode sortList(ListNode head) {
        
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        
        ListNode temp=head;
        
        while(temp!=null)
        {
            pq.add(temp.val);
            temp=temp.next;
        }
        
        ListNode dummy=new ListNode(0);
        head=dummy;
        while(pq.size()>0)
        {
            head.next=new ListNode(pq.remove());
            head=head.next;
        }
        
        return dummy.next;
    }
}
