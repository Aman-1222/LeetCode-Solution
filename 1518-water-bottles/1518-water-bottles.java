class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int cnt=numBottles;
        int digit=1;
        while(digit>0){
            digit=numBottles/numExchange;
            cnt+=digit;
            numBottles=numBottles%numExchange+digit; 
        }
        return cnt;
    }
}