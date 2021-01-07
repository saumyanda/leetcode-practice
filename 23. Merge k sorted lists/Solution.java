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
    public ListNode mergeKLists(ListNode[] lists) {
        
        LinkedList<Integer> merged=new LinkedList<Integer>();
        
        for(int i=0;i<lists.length;i++)
        {
            ListNode head=lists[i];
            ListNode temp=head;
            while(temp!=null)
            {
                merged.add(temp.val);
                temp=temp.next;
            }
        }
        
        Collections.sort(merged);
        
        System.out.print(merged);
        
        ListNode result=new ListNode(0);
        
        ListNode res=result;
        
        for(int i=0;i<merged.size();i++)
        {
            result.next=new ListNode(merged.get(i));
            result=result.next;
        }
        
        return res.next;
    }
}
