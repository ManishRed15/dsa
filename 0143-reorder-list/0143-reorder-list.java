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
        //1. find the middle value
        //2.I will reverse the list from middle.next
        //3. Adjust the new list

        ListNode fast = head, slow =head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalf = slow.next;
        slow.next = null;

        secondHalf = reverse(secondHalf);

        ListNode l1 = head;
        while(secondHalf != null){
            ListNode nextFirst = l1.next;
            ListNode nextSecond = secondHalf.next;

            l1.next = secondHalf;
            secondHalf.next = nextFirst;
            l1 = nextFirst;
            secondHalf = nextSecond;
        }
        
    }

    private ListNode reverse(ListNode node){
        ListNode prev = null;
        ListNode curr = node;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}