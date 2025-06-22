class MyQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    public void push(int x) {
        stack1.push(x);
    }
    
    public int pop() {
        swap(stack1,stack2);
        int value = stack2.pop();
        swap(stack2,stack1);
        return value;
    }
    
    public int peek() {
        swap(stack1,stack2);
        int value = stack2.peek();
        swap(stack2,stack1);
        return value;
    }
    
    public boolean empty() {
        return stack1.size()==0;
    }

    public void swap(Stack stack1, Stack stack2){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */