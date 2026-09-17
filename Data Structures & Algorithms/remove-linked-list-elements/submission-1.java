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
    public ListNode removeElements(ListNode head, int val) {
        ListNode curr = new ListNode(0);
        ListNode res = curr;

        while(head != null){
            if(head.val != val){
                curr.next = head;
                curr = curr.next;
            } else {
                curr.next = null;
            }
            head = head.next;
        }
        return res.next;
    }
}