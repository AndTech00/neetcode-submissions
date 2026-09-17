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
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;;
        }

        //A questo punto sono a metà della lista.
        ListNode prev = null;
        while(slow != null){
            ListNode temp = slow.next;
            slow.next = prev;
            prev = slow;

            slow = temp;
        }

        ListNode fromStart = head;
        while(prev != null){
            if(prev.val != fromStart.val){
                return false;
            }
            prev = prev.next;
            fromStart = fromStart.next;
        }
        return true;
    }
}