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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode l1 = head;
        ListNode l2 = spiltList(head);

        l1 = sortList(l1);
        l2 = sortList(l2);

        ListNode dummy = new ListNode(-1);
        ListNode res = dummy;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                res.next = l1;
                l1 = l1.next;
            }
            else{
                res.next = l2;
                l2 = l2.next;
            }
            res = res.next;
        }

        if(l1 != null){
            res.next = l1;
        }
        else{
            res.next = l2;
        }

        return dummy.next;

    }

    public ListNode spiltList(ListNode head){
        ListNode prev = null, slow = head, fast = head;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        return slow;
    }
}