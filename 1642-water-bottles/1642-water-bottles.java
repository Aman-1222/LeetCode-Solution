class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        int empty = numBottles;
        while(empty>=numExchange){
            int full=empty/numExchange;
            ans+=full;
            empty=full+(empty%numExchange);
        }
        return ans;
    }
}