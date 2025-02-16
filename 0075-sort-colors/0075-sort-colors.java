class Solution {
    public void sortColors(int[] nums) {
        int count1=0, count2=0, count3=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                count1++;
            }
            else if(nums[i]==1){
                count2++;
            }
            else{
                count3++;
            }
        }
        for(int i=0; i<count1; i++)
        {
            nums[i] = 0;
        }
        for(int i=count1; i<count1+count2; i++)
        {
            nums[i] = 1;
        }
        for(int i=count2+count1; i<nums.length; i++)
        {
            nums[i] = 2;
        }
    }
}