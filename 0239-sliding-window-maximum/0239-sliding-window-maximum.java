class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n-k+1];
        Deque<Integer> deq = new LinkedList<>();

        for(int i=0; i<n; i++){

            while(!deq.isEmpty() && deq.peekFirst() < i-k+1){
                deq.pollFirst();
            }

            while(!deq.isEmpty() && nums[deq.peekLast()] < nums[i]){
                deq.pollLast();
            }
            deq.offerLast(i);

            if(i >= k-1){
                res[i-k+1] = nums[deq.peekFirst()];
            }
        }
        return res;
        
    }
}