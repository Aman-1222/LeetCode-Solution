class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int bottlesDrunk = numBottles;
        int emptyBottles = numBottles;
        while(emptyBottles>=numExchange){
            emptyBottles=emptyBottles-numExchange+1;
            bottlesDrunk++;
            numExchange++;
        }
        return bottlesDrunk;
    }
}