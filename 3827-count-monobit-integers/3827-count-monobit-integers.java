class Solution {
    public int countMonobit(int n) {
        int ans=1;
        int i=1;
        while(i<=n){
            ans++;
            i+=i+1;
        }
        return ans;
    }
}