class MyStack {
    Queue<Integer> stack;

    public MyStack() {
        stack = new LinkedList<>();
    }
    
    public void push(int x) {
        stack.offer(x);
    }
    
    public int pop() {
        if(stack.isEmpty()) throw new RuntimeException("Stack is empty");

        for(int i=0; i<stack.size()-1;i++){
            int value = stack.poll();
            stack.offer(value);
        }
        return stack.poll();
    }
    
    public int top() {
        if(stack.isEmpty()) throw new RuntimeException("Stack is empty");

        for(int i=0; i<stack.size()-1;i++){
            int value = stack.poll();
            stack.offer(value);
        }
        
        int x = stack.poll();
        stack.offer(x);
        return x;

    }
    
    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */