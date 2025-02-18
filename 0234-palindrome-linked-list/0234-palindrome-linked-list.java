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
        StringBuilder str = new StringBuilder();
        ListNode current = head;

        while(current != null){
            str.append(current.val);
            current = current.next;  
        }

        String original = str.toString();

        String reversed = str.reverse().toString();
        return original.equals(reversed);
        
    }
}