class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] answer = Arrays.copyOf(prices, n);

        for(int i=0; i<prices.length; i++){
            for(int j=i+1; j<prices.length;j++){
                if(prices[j] <= prices[i]){
                    answer[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        return answer;
    }
}


