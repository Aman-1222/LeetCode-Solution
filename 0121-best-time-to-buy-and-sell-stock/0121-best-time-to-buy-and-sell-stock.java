class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int bought=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            bought=Math.min(prices[i],bought);
            profit=Math.max(profit,prices[i]-bought);
        }
        return profit;
    }
}