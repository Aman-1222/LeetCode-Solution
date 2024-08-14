class Solution {
    public int countPrimes(int n) {
        if(n==0 || n==1) return 0;
        int cnt=0;
        int[] arr = new int[n];
        for(int i=2;i<n;i++) arr[i]=1;
        for(int i=2;i*i<n;i++){
            if(arr[i]==1){
                for(int j=i*i;j<n;j+=i) arr[j]=0;
            }
        }
        for(int i=2;i<n;i++)
            if(arr[i]==1) cnt++;
        return cnt;
    }
}