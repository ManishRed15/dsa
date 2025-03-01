class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    
   // Map<Integer, Integer> map = new HashMap<>();
    int[] arr = new int[10001];
    Stack<Integer> stack = new Stack<>();

    for(int i=0; i<nums2.length; i++){
        while(!stack.isEmpty() && stack.peek() < nums2[i]){
            //map.put(stack.pop(),nums2[i]);
            arr[stack.pop()] = nums2[i];
        }
        stack.push(nums2[i]);
    }
    int ans;
   // int[] results = new int[nums1.length];
    for(int i=0; i<nums1.length;i++){
        ans = arr[nums1[i]];
        if(ans == 0){
            nums1[i] = -1;
        }
        else{
            nums1[i] = ans;
        }
    }

    return nums1;
    
    }
}