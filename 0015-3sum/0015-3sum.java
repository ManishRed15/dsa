class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> results = new ArrayList<>();
        for(int i=0; i<n-2; i++){
            if(i==0 || nums[i] != nums[i-1]){
            int target = -nums[i];
            int first = i+1;
            int last = n-1;
            while(first < last){
                int sum = nums[first] + nums[last];
                if(sum > target) last--;
                else if(sum < target) first++;
                else{
                    results.add(Arrays.asList(nums[i],nums[first],nums[last]));
                    first++;
                    last--;

                    while(first < last && nums[first]==nums[first-1]) first++;
                    while(first < last && nums[last]== nums[last+1]) last--;  
                }
            }
        }

        }
        return results;
    }
}