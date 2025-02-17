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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode fp = list1, sp = list2;
        ListNode head = null, tail = null;
        while(fp != null || sp != null){
            ListNode final_node = null;
            if(fp != null && sp != null){
                if(fp.val <= sp.val){
                    final_node = fp;
                    fp = fp.next;
                }
                else{
                    final_node = sp;
                    sp = sp.next;
                }
            }
            else if(fp != null){
                final_node = fp;
                fp = fp.next;
            }
            else{
                final_node = sp;
                sp = sp.next;
            }

            tail = insertAtEnd(tail, final_node.val);
            if(head == null){
                head = tail;
            }
        }
        return head;
    }
    public ListNode insertAtEnd(ListNode tail, int val){
        ListNode nodeToBeInserted = new ListNode(val);
        if(tail != null){
            tail.next = nodeToBeInserted;
        }
        return nodeToBeInserted; 
    }

}