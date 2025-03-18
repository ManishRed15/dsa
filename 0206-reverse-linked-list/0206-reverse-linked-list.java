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
        if(head==null) return null;

        ListNode last = reverseRec(head);
        last.next = null;
        return newHead;
        
    }

    public ListNode reverseRec(ListNode node){
        if(node.next == null){
            newHead = node;
            return node;
        }
        else{
            ListNode last = reverseRec(node.next);
            last.next = node;
            return node;
        }

    }
}