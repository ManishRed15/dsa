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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode cur = head;
        int carry = 0;

        while(l1 != null || l2 != null){
            int sum = 0;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }

            sum += carry;
            int val = sum % 10;
            carry = sum / 10;

            if(head == null){
                head = new ListNode(val);
                cur = head;
            }
            else{
                cur.next = new ListNode(val);
                cur = cur.next;
            }
        }

        if(carry > 0){
            cur.next = new ListNode(carry);
            cur = cur.next;
        }
        return head;    
    }
}