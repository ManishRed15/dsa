class Solution {
    public int strStr(String haystack, String needle) {
    int m = haystack.length();
    int n = needle.length();

    if(n>m) return -1;


    for(int i=0; i<=m-n;i++){
        int j =0;
        while(j<n && haystack.charAt(j+i)==needle.charAt(j)){
            j++;
        }

        if(j==n) return i;

    }
    return -1;

}
}