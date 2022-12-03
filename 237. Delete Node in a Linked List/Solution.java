/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode temp=node;
        ListNode temp2=temp.next;
        temp.val=temp2.val;
        temp.next=temp2.next;
    }
}
