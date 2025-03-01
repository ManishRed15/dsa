class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        int[] results = new int[nums.length];

        for(int i=1; i < nums.length; i++){
            while(stack.size() > 0 && nums[stack.peek()] < nums[i]){
                results[stack.pop()] = nums[i];
            }
            stack.push(i);
        }

        for(int i=0; i < nums.length; i++){
            while(stack.size()>0 && nums[stack.peek()] < nums[i]){
                results[stack.pop()] = nums[i];
            }
        }

        while(stack.size() > 0){
            results[stack.pop()] = -1;
        }

        return results;
    }
}