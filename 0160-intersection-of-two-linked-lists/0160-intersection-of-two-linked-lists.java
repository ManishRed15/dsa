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
        int m = findLength(headA);
        int n = findLength(headB);
        ListNode fp =headA, sp =headB;
        if(m < n){
            for(int i=0; i < n-m; i++){ 
                sp = sp.next; 
            }
        }
        else if(n < m){
            for(int i=0; i < m-n; i++){
                fp = fp.next;
            }
        }

        return findSameNode(fp,sp);
        
    }

    public ListNode findSameNode(ListNode fp, ListNode sp){
        while(fp != null && sp != null){
            if(fp == sp){
                return fp;
            }
            else{
                fp = fp.next;
                sp = sp.next;
            }
        }
        return null;
    }

    public int findLength(ListNode head)
    {
        ListNode cur = head;
        int length = 0;
        while(cur != null){
            length++;
            cur = cur.next;
        }
        return length;
    }
}