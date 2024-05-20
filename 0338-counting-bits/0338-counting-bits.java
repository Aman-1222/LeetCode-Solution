class Solution {
    public int[] countBits(int n) {
        int ans[] = new int[n+1];
        for(int i=1;i<=n;i++)
            ans[i]=totalBits(i);
        return ans;
    }
    public int totalBits(int n){
        int cnt=0;
        while(n!=0){
            cnt++;
            n=n&(n-1);
        }
        return cnt;
    } 
}