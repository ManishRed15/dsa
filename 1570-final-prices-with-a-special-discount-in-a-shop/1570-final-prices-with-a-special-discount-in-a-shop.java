class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] answer = Arrays.copyOf(prices,n);
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<prices.length;i++){
            while(!stack.isEmpty() && prices[stack.peek()]>=prices[i]){
                answer[stack.pop()] -= prices[i];
            }
            stack.push(i);
        }
        return answer ;
}
}


