class Solution {
    public int mySqrt(int x) {
        //return (int)Math.sqrt(x);
        if(x==0 || x==1) return x;
        int low = 1 , high=x/2;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid==x/mid) return mid;
            if(mid<x/mid) low=mid+1;
            else high=mid-1;
        }
        return high;
    }
}