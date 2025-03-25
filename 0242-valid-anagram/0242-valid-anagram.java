class Solution {
    public boolean isAnagram(String s, String t) {
        /*
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        return Arrays.equals(sArr, tArr); */

        //Char in java supports Unicode

        if(s.length() != t.length()) return false;

        Map<Character, Integer> countMap = new HashMap<>();

        for(char c:s.toCharArray()){
            countMap.put(c, countMap.getOrDefault(c,0)+1);
        }

        for(char c:t.toCharArray()){
            countMap.put(c, countMap.getOrDefault(c,0)-1);
            if(countMap.get(c) < 0){
                return false;
            }
        }

        return true;
    }
}