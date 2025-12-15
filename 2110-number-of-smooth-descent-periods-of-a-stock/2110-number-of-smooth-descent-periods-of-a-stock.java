class Solution {
    public long getDescentPeriods(int[] prices) {
        long ans = prices.length;
        int i=0,j=0;
        while(j<prices.length-1){
            if(prices[j]-prices[j+1]==1) ans+=j-i+1;
            else i=j+1;
            j++;
        }
        return ans;
    }
}