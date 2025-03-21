class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefixProduct = new int[n];

        prefixProduct[0] = 1;
        for(int i=1; i<n;i++){
            prefixProduct[i] = prefixProduct[i-1] * nums[i-1];
        }

        int suffixProduct = 1;
        for(int i=n-1; i>=0; i--){
            prefixProduct[i] *= suffixProduct;
            suffixProduct *= nums[i]; 
        } 
        return prefixProduct;
    }
}