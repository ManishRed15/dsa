class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(Character c:s.toCharArray()){
            if(isOpen(c)){
                stack.push(c);
            }
            else{
                if(stack.size()>0 && isSame(stack.peek(),c)){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean  isOpen(char c){
        return c=='(' || c=='{' || c=='[';
    }

    private boolean isSame(char x,char y){
        return (x=='(' && y==')') || (x=='[' && y==']') || (x=='{' && y=='}');
    }
}
