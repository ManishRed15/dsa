class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length -2; i++){
            int first = i+1;
            int last = nums.length - 1;
            if(i > 0 && nums[i] == nums[i-1]){

                continue;
            }
            while(first < last){
                int sum = nums[i]+nums[first]+nums[last];

                if(sum == 0){
                    result.add(Arrays.asList(nums[i],nums[first],nums[last]));
                    first++;
                    while(nums[first] == nums[first-1] && first < last){
                        first++;
                    }
                }
                else if(sum < 0)
                    first++;
                else
                    last--;
            }
        }
        return result;
    }
}