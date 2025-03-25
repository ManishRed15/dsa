class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> myMap = new HashMap<>();

        for(String s: strs){
            char[] sArr = s.toCharArray();
            Arrays.sort(sArr);
            String key = new String(sArr);

            if(!myMap.containsKey(key)){
                myMap.put(key, new ArrayList<>());
            }

            myMap.get(key).add(s); 
        }

        return new ArrayList<>(myMap.values());

    }
}