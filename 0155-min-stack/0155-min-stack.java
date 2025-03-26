class MinStack {
    /*We can solve this problem using Auxiliary Stack also or insert a int[] into stack with curr min*/  
    /*To efficiently retrieve the minimum value in constant time, a single stack is used with an auxiliary technique:
    Store previous min values: When pushing a new minimum, store the old min first.
    Pop min values correctly: If the popped value is the current min, restore the previous min from the stack.
    This avoids using an extra stack while ensuring O(1) min retrieval. */
    public Node head;

    public class Node{
        int val;
        int min;
        Node next;
        public Node(int val,int min,Node next){
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }

    public MinStack() {
        
    }
    
    public void push(int val) {
        if(head==null){
            head = new Node(val,val,null);
        }
        else{
            head = new Node(val, Math.min(val,head.min),head);
        }
        
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
        return head.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */