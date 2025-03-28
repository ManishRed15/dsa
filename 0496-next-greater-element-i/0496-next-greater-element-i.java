class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int[] ans= new int[n];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<m;i++){
            map.put(nums2[i],i);
        }

        for(int i=0;i<n;i++){
            int indexStart = map.get(nums1[i]);
            int j = indexStart+1;
            boolean check = true;
            while(check){
                if(j<m && nums2[indexStart]<nums2[j]){
                    ans[i]=nums2[j];
                    check = false;
                }
                else if(j<m-1){
                    j++;
                }
                else{
                    ans[i]=-1;
                    check = false;
                }
            }
        }

        return ans;
        
    }
}