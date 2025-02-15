class Solution {
    public int majorityElement(int[] nums) {
        int maj_num =0; int count =0;
        for(int num:nums){
            if( count == 0 ){
                maj_num = num;
            }
            count += (maj_num == num) ? 1 : -1;
        }
        return maj_num;
    }
}