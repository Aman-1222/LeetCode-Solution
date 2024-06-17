class Solution {
    public boolean judgeSquareSum(int c) {
        if(c==0) return true;
        for(long i=1;i*i<=c;i++){
            long val=c-(i*i);
            if((long)Math.sqrt(val)*Math.sqrt(val)==val) return true;
        }
        return false;
    }
}

