class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(Character c : s.toCharArray()){
            if(isOpen(c))
                stack.push(c);
            else{
                if(stack.size()>0 && isSame(stack.peek(),c)){
                    stack.pop();
                }
                else
                    return false;
            }

        }
        return stack.size()==0;    
    }

    public boolean isSame(char open, char close){
        return (open=='(' && close==')')||(open=='{' && close=='}')||(open=='['&&close==']');
    }

    public boolean isOpen(char c){
        return c=='(' || c=='[' || c=='{';
    }
}