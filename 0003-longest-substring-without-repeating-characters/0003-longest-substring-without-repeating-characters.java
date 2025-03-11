class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> hs = new HashSet<>();
        int maxLen = 0, fp = 0;

        for(int sp=0;sp<s.length();sp++){
            while(hs.contains(s.charAt(sp))){
                hs.remove(s.charAt(fp));
                fp++;
            }
            hs.add(s.charAt(sp));
            maxLen = Math.max(maxLen, sp-fp+1);
        }

        return maxLen; 
    }
}