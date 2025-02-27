class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(Character c : s.toCharArray()){
            if(!stack.isEmpty()){
                if(isSame(stack.peek(),c)){
                    stack.pop();
                    continue;
                }
            }
            stack.push(c);
        } 
        return stack.isEmpty();   
    }

    public boolean isSame(char open, char close){
        return (open=='(' && close==')')||(open=='{' && close=='}')||(open=='['&&close==']');
    }

    public boolean isOpen(char c){
        return c=='(' || c=='[' || c=='{';
    }
}