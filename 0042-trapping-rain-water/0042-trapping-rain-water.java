class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int leftMax = 0;
        int rightMax = 0;
        int res = 0 ;

        while(left <= right){
            if(height[left] <= height[right]){
                if(height[left] >= leftMax)
                    leftMax = height[left];
                else
                    res+= leftMax - height[left];
                left++;
            }
            else{
                if(height[right] >= rightMax)
                    rightMax = height[right];
                else
                    res+= rightMax - height[right];
                right--;
            }
        }
        return res;
    }
}

/* using couple of arrays 

int n = height.length;
        int left[] = new int[n];
        int right[] = new int[n];
        int res = 0;
        left[0] = height[0];
        for(int i=1; i<n; i++){
            left[i] = Math.max(left[i-1], height[i]);
        }
        right[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            right[i] = Math.max(right[i+1], height[i]);
        }
        for(int i=0; i<n; i++){
            res += Math.min(left[i],right[i]) - height[i];
        }
        return res;

*/