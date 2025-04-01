class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> hashSet = new HashSet<>();
        int fp=0;
        int res = 0;
        for(int sp=0;sp<s.length();sp++){
            while(hashSet.contains(s.charAt(sp))){
                hashSet.remove(s.charAt(fp));
                fp++;
            }
            hashSet.add(s.charAt(sp));
            res = Math.max(res,hashSet.size());
        }
        return res;
    }
}