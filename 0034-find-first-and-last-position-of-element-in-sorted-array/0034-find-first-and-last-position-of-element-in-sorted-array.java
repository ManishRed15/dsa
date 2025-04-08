class Solution {
    public int[] searchRange(int[] nums, int target) {
        int startIndex = findStartIndex(nums, target);
        int endIndex = findEndIndex(nums, target);
        
        return new int[]{startIndex, endIndex};
    }

    public int findStartIndex(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        int ans = -1;
        while(start <= end){
            int mid = (start+end)/2;
            if(nums[mid]<target){
                start = mid+1;
            }
            else if(nums[mid] > target){
                end = mid-1;
            }
            else{
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }
    
    public int findEndIndex(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        int ans = -1;
        while(start <= end){
            int mid = (start+end)/2;
            if(nums[mid]<target){
                start = mid+1;
            }
            else if(nums[mid] > target){
                end = mid-1;
            }
            else{
                ans = mid;
                start = mid + 1;
            }
        }
        return ans;
    }
}

/* class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{binarySearch(nums, target, true), binarySearch(nums, target, false)};
    }

    private int binarySearch(int[] nums, int target, boolean findStart) {
        int start = 0, end = nums.length - 1, ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                ans = mid;
                if (findStart) end = mid - 1;
                else start = mid + 1;
            }
        }
        return ans;
    }
}
*/