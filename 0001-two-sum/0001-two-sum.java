class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> mymap = new HashMap<>();
        for(int i=0; i<n; i++){
            int complement = target - nums[i];
            if(mymap.containsKey(complement)){
                return new int[]{mymap.get(complement),i};
            }

            mymap.put(nums[i], i);
        }
        return new int[]{};
    }
}