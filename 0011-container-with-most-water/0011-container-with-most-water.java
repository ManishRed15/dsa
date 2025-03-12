class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int ans = 0;

        while (left < right) {
            int len = Math.min(height[left], height[right]);
            int breadth = right - left;
            int area = len * breadth;
            ans = Math.max(ans, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;  
            }
        }
        return ans;
    }
}
