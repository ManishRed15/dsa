import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    int b = stack.pop(), a = stack.pop();
                    stack.push(a - b);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    int b2 = stack.pop(), a2 = stack.pop();
                    stack.push(a2 / b2);
                    break;
                default:
                    stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}



/*
        Stack<Integer> stack = new Stack<>();
        for(String token: tokens){
            if(isOperator(token)){
                int val2 = stack.pop();
                int val1 = stack.pop();
                int result = evaluate(token, val1, val2);
                stack.push(result);
            }
            else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();        
    }

    public boolean isOperator(String token){
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }*/

   /* public int evaluate(String token, int val1, int val2){
        if (token.equals("+"))
            return val1+val2;
        else if (token.equals("-"))
            return val1-val2;
        else if (token.equals("*"))
            return val1*val2;
        else 
            return val1/val2;
    }*/