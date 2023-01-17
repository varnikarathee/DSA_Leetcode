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
    public ListNode reverseList(ListNode head) {
        ListNode x = new ListNode();
        ListNode y = head;
        while (y != null) {
            ListNode next = y.next;
            y.next = x.next;
            x.next = y;
            y = next;
        }
        return x.next;
    }
}