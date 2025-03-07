class Solution {
    public String makeGood(String s) {
        StringBuilder str = new StringBuilder();

        for(char c:s.toCharArray()){
            int len = str.length();
            if(len>0 && Math.abs(str.charAt(len-1)-c)==32){
                str.deleteCharAt(len-1);
            }
            else{
                str.append(c);
            }
        }
        return str.toString();
    }
}