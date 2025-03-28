class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token:tokens){
            switch (token) {
                case "+":
                    stack.push(stack.pop()+stack.pop());
                    break;
                case "*":
                    stack.push(stack.pop()*stack.pop());
                    break;
                case "-":
                    int b = stack.pop(), a = stack.pop();
                    stack.push(a-b);
                    break;
                case "/":
                    int b1 = stack.pop(), a1 = stack.pop();
                    stack.push(a1/b1);
                    break;
                default:
                    stack.push(Integer.parseInt(token)); 
                
            }
        }
        return stack.pop();
    }
}