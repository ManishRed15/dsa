class Solution {
    public String makeGood(String s) {
        StringBuilder str = new StringBuilder();

        for(char c:s.toCharArray()){
            int len = str.length();
            if(len>0 && Math.abs(str.charAt(len-1)-c)== ('a'-'A')){
                str.deleteCharAt(len-1);
            }
            else{
                str.append(c);
            }
        }
        return str.toString();
        
      /*  char[] stack = s.toCharArray();

        int top = -1;

        for(char c : stack) {
            if(top >= 0 && Math.abs(stack[top] - c) == 'a' - 'A' )
            {
                top--;
            }
            else{
                stack[++top] = c;
            }
        }
        return new String(stack, 0, top+1);*/


    }
}