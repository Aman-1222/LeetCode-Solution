class Solution {
    public boolean judgeSquareSum(int c){
        for(long i=0;i*i<=c;i++){
            double val=Math.sqrt(c-(int)(i*i));
            if(val==(int)val) return true;
        }
        return false;
    }
}

