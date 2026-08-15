class Solution {
    public int maxProfit(int[] prices) {
        int price = prices[0];
        int tempprofit = 0 ;
        int profit    = 0 ;
        for( int i = 0; i<prices.length;i++){
            
            tempprofit = prices[i]-price;
            profit = Math.max(profit,tempprofit);
            price = Math.min(price,prices[i]);
           
        }
        return profit;
    }
}