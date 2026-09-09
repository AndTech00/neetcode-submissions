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
    public ListNode middleNode(ListNode head) {
        int size = 1;
        ListNode start = head;
        ListNode current = start.next;

        while(current != null){
            size++;
            current = current.next;
        }

        int i = 0;
        while(start != null){
            if(i >= size/2){
                return start;
            } else {
                start = start.next;
                i++;
            }
        }
        return start;
    }
}