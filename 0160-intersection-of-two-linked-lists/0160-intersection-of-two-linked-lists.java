/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int m = getLength(headA);
        int n = getLength(headB);

        ListNode first = headA, second = headB;

        if(m<n){
            for(int i=0; i<n-m; i++){
                second = second.next;
            }
        }
        else if(m>n){
            for(int i=0; i<m-n; i++){
                first = first.next;
            }
        }

        return findSameNode(first,second);
        
    }

    private int getLength(ListNode head){
        ListNode current = head;
        int length = 0;
        while(current != null){
            length++;
            current = current.next;
        }
        return length;
    }

    private ListNode findSameNode(ListNode first, ListNode second){
        while(first != null && second != null){
            if(first == second){
                return first;
            }
            else{
                first = first.next;
                second = second.next;
            }
        }
        return null;
    }
}