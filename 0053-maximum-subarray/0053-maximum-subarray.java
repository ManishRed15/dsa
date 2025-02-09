class Solution {
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int currentSum = nums[0];
        for(int i=1;i < nums.length;i++){
            if(currentSum < 0){
                currentSum = 0;
            }
            currentSum = currentSum + nums[i];
            if(currentSum > maxSoFar){
                maxSoFar = currentSum;
            }
        }
        return maxSoFar;
        
    }
}

/* 
class Solution {
    public int maxSubArray(int[] nums) {
        int globalMax = Integer.MIN_VALUE;
        int localMax = 0; 
        for(int i=0;i<nums.length;i++){
            localMax=Math.max(nums[i],nums[i]+localMax);
           globalMax = Math.max(localMax,globalMax);
        }
        return globalMax;
    }
} */
/* If you want to return the subarray as well

public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int currentSum = nums[0];
        int start=0, end=0, tempStart=0;

        for(int i = 1; i < nums.length; i++) {
            currentSum = currentSum + nums[i];
            if (currentSum < 0) {
                currentSum = 0;
                tempStart = i+1;
            }
            if (currentSum > maxSoFar) {
                maxSoFar = currentSum;
                start = tempStart;
                end = i;
            }
        }
        System.out.println("The subarray with maximum sum is: "+ Arrays.toString(Arrays.copyOfRange(nums, start,end+1)));
        return maxSoFar;
    }

*/
