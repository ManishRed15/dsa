class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int candidate1=0, count1=0, candidate2=0, count2=0;
        for( int num : nums)
        {
            if(num == candidate1){
                count1++;
            }
            else if(num == candidate2){
                count2++;
            }
            else if(count1==0){
                candidate1 = num;
                count1 = 1;
            }
            else if(count2==0){
                candidate2 = num;
                count2 = 1;
            }
            else{
                count1--;
                count2--;
            }
        }

       count1=count2 =0;
        for(int num:nums){
            if(num == candidate1) count1++;
            if(num == candidate2) count2++;
        }
        List<Integer> results = new ArrayList<>();
        if(count1 > n/3) results.add(candidate1);
        
        if(count2 > n/3 && candidate1 != candidate2)results.add(candidate2);

        return results;
        
    }
}