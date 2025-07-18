class Solution {
    public double myPow(double x, int num) {
        double ans=1;
        long n=num;
        boolean flag=false;
        if(n<0)
            n=-n;
        while(n>0){
            if(n%2!=0)
                ans*=x;
            x=x*x;
            n=n/2;
        }
        if(num<0) return 1/ans;
        else return ans;
    }
}