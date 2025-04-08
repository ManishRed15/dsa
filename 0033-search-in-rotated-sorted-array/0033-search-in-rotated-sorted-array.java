class Solution {
    public int search(int[] nums, int target) {
        int por = findPointOfRotate(nums);
        int res;
        if(target >= nums[por] && target <= nums[nums.length - 1]){
            res = binarySearch(nums, target, por, nums.length-1);
        }
        else{
            res = binarySearch(nums, target, 0, por-1);
        }

        return res;
    }

    public int findPointOfRotate(int[] nums){
        int start=0, end = nums.length-1;
        while(start < end){
            int mid = (start+end)/2;
            if(nums[mid] > nums[end]){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }

    public int binarySearch(int[] nums, int target, int start, int end){
        while(start <= end){
            int mid = (start+end)/2;
            if(nums[mid] < target){
                start = mid+1;
            }
            else if(nums[mid] > target){
                end = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}