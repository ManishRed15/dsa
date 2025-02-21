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
    public void reorderList(ListNode head) {
        if(head.next == null){
            return;
        }

        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalf = slow.next;
        slow.next = null;

        secondHalf = reverseList(secondHalf);

        ListNode current = head;
        while(secondHalf != null){
            ListNode nextFirst = current.next;
            ListNode nextSecond = secondHalf.next;

            current.next = secondHalf;
            secondHalf.next = nextFirst;

            current = nextFirst;
            secondHalf = nextSecond;
        }

        
    }

    private ListNode reverseList(ListNode head){
        ListNode current = head;
        ListNode prev = null;
        while(current != null){
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }
}