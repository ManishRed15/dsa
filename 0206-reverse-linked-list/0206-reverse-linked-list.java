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
    private ListNode newHead;
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode last = reverseNode(head);
        last.next = null;
       // head = newHead;
        return newHead;
    }
    public ListNode reverseNode(ListNode node){
        if(node.next == null){
            newHead = node;
            return node;
        }
        ListNode last = reverseNode(node.next);
        last.next = node;
        return node;
    }
}

