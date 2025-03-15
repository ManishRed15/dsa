class Solution {
    public int maxProfit(int[] prices) {
        int minSoFar = prices[0];
        int totalProfit = 0;
        for(int i=1; i < prices.length; i++){
            int profit = prices[i] - minSoFar;
            if(totalProfit < profit){
                totalProfit = profit;
            }
            minSoFar = Math.min(minSoFar, prices[i]);
        }
        return totalProfit;  
    }
}