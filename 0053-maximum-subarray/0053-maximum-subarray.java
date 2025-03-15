class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = nums[0], maxSum = nums[0];

        for(int i=1; i<n; i++){
            if(sum<0){
                sum=0;
            }
        
            sum = sum + nums[i];
            maxSum =Math.max(sum, maxSum);
        }
        return maxSum;

    }
}