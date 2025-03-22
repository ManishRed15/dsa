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
            if(!set.contains(num-1)){            // T.C = O(N)
                while(set.contains(nextNum)){    // while(set.contains(nextNum)) loop runs at 
                    nextNum++;                   //most n times total over the entire array
                    count++;                     //Because each element is only part of one
                }                                //sequence and visited once.
            ans = Math.max(ans, count);
            }
        }
        return ans;
    }
}
