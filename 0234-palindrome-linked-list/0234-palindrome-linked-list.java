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
        if(head == null || head.next == null){
            return true;
        }
        int n = findLength(head);
        int breakPoint = n/2;
        if(n%2 != 0){
            breakPoint = n/2 + 1;
        }
        ListNode reverseNode = pointToBreak(head, breakPoint);
        ListNode prev = pointToBreak(head, breakPoint-1);

        reverseFunction(prev, reverseNode);

        ListNode first = head;
        ListNode second = prev.next;
        while(first != null && second != null){
            if(first.val != second.val){
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;
    }

    private int findLength(ListNode head){
        ListNode current = head;
        int length = 0;
        while(current != null)
        {
            current = current.next;
            length++;
        }
        return length;
    }

    private ListNode pointToBreak(ListNode head, int k)
    {
        int count = 0;
        ListNode current = head;
        while(count < k){
            current = current.next;
            count++;
        }
        return current;
    }

    private void reverseFunction(ListNode prev, ListNode reverseNode){
        ListNode first = reverseNode;
        ListNode second = first.next;
        while(first != null && second != null){
            ListNode temp = second.next;
            second.next = first;
            first = second;
            second = temp;
        }
        prev.next.next = null;
        prev.next = first;
    }
}