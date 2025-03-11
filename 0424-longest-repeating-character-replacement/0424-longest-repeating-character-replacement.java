class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int fp=0;
        int maxLength = 0;
        int maxCount = 0;

        for(int sp=0;sp<s.length();sp++){
            count[s.charAt(sp)-'A']++;
            maxCount = Math.max(maxCount, count[s.charAt(sp)-'A']);

            while((sp-fp+1)-maxCount > k){
                count[s.charAt(fp)-'A']--;
                fp++;
            }

            maxLength = Math.max(maxLength,sp-fp+1);
        }

        return maxLength;
    }
}