class Solution {
    public int maxProfit(int[] prices) {
        int buyDay = prices[0];
        int maxProfit = 0;
        int profit;
        for(int i=1; i<prices.length; i++){
            profit = prices[i] - buyDay;
            maxProfit = Math.max(maxProfit,profit);
            buyDay = Math.min(buyDay, prices[i]);
        }
        return maxProfit;
    }
}