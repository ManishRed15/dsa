class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        int ans = 0;
        for(int num : set){
            int nextNum = num + 1;
            int count = 1;
            if(!set.contains(num-1)){
                while(set.contains(nextNum)){
                    nextNum++;
                    count++;
                }
            ans = Math.max(ans, count);
            }
        }
        return ans;
    }
}
