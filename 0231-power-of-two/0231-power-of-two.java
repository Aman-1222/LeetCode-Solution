class Solution {
    public boolean isPowerOfTwo(int n) {
        int num=n;
        if(num==0) return false;
        int count=0;
        while(num!=0){
            if((num&1)==1) count++;
            if(count==2) return false;
            num=num>>1;
        }
        return true;
    }
}