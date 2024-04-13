class Solution {
    public double myPow(double x, int n) {
        if(n==0) return 1.0;
        if(x==0) return 0.0;
        double dup=n;
        double ans=1.0;
        if(n<0) dup*=-1;
        while(dup>0){
            if(dup%2==1){
                ans=ans*x;
                dup-=1;
            }
            else{
                x=x*x;
                dup/=2;
            }
        }
        if(n<0) return 1/ans;
        return ans;
    }
}