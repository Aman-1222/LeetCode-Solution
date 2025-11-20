class Solution {
    public long removeZeros(long n) {
        long ans=0;
        long dig=0;
        while(n>0){
            if(n%10!=0){
                ans=(n%10)*(long)Math.pow(10,dig)+ans;
                dig++;
            }
            n/=10;
        }
        return ans;
    }
}