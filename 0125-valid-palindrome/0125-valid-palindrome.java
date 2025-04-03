class Solution {
    public boolean isPalindrome(String s) {
        char[] charArr = new char[s.length()];
        int i = 0;
        for(char c:s.toCharArray()){
            if((c>='0' && c<='9')||(c>='a' && c<='z')){
                charArr[i] = c;
                i++;
            }
            else if(c >= 'A' && c<='Z'){
                charArr[i] = (char)(c+32);
                i++;
            }
        }

        int left = 0, right = i-1;
        while(left<right){
            if(charArr[left]!=charArr[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
/*
int left = 0, right = s.length()-1;
        while(left <= right){
            char leftChar = Character.toLowerCase(s.charAt(left));
            char rightChar = Character.toLowerCase(s.charAt(right));
            if(!Character.isLetterOrDigit(leftChar))
                left++;
            else if(!Character.isLetterOrDigit(rightChar))
                right--;
            else if(leftChar != rightChar)
                return false;
            else{
                left++;
                right--;
            }
        }
        return true;
*/