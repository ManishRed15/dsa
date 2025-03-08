class Solution {
    public String removeDuplicates(String s) {
        StringBuilder res = new StringBuilder();
        for(int i=0;i<s.length();i++){
            int len = res.length();
            if(len>0 && res.charAt(len-1) == s.charAt(i)){
                res.deleteCharAt(len-1);
            }
            else{
            res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}