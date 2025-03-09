class Solution {
    public int strStr(String haystack, String needle) {
    //You two pointer to easilt solve it with worst T.C = O(M+N)
        int m = haystack.length();
        int n = needle.length();
        int[] lps = new int[n];
        int i = 1;
        int len = 0;

        while(i < n){
            if(needle.charAt(i)==needle.charAt(len)){
                len++;
                lps[i] = len;
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

        i = 0;
        int j = 0;

        while (i<m){
            if(haystack.charAt(i)==needle.charAt(j)){
                i++;
                j++;
            }

            if(j==n){
                return i-j;
            }
            else if(i<m && haystack.charAt(i)!=needle.charAt(j)){
                if(j==0){
                    i++;
                }
                else{
                    j = lps[j-1];
                }
            }
        }

        return -1; 


    }
}