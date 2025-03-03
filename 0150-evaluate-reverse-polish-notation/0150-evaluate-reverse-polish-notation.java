class Solution {
    public int evalRPN(String[] tokens) {

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
    }

    public int evaluate(String token, int val1, int val2){
        if (token.equals("+"))
            return val1+val2;
        else if (token.equals("-"))
            return val1-val2;
        else if (token.equals("*"))
            return val1*val2;
        else 
            return val1/val2;
    }
}