class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int len=happiness.length;
        Arrays.sort(happiness);
        long sum=0;
        int deduct=0;
        for(int i=len-1;i>=0;i--){
            if(k==0 || happiness[i]-deduct<=0) break;
            sum+=happiness[i]-deduct;
            deduct++;
            k--;          
        }
       return sum;
    }
}