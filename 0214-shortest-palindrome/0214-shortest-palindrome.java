class Solution {
    public String shortestPalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        String combined = s+"#"+rev;

        int[] lps = lpsArray(combined);

        int longestPalindromeSeq = lps[lps.length-1];

        return rev.substring(0,rev.length()-longestPalindromeSeq)+s;
        
    }

    public int[] lpsArray(String combined){
        int n = combined.length();
        int[] lps = new int[n];
        int i =1;
        int len =0;

        while(i<n){
            if(combined.charAt(i)==combined.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else{
                if(len==0){
                    lps[i] = 0;
                    i++;
                }
                else{
                    len = lps[len-1];
                }
            }
        }

        return lps;
    }
}