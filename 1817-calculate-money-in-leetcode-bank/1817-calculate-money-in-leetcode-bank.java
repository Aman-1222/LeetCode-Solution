class Solution {
    public int totalMoney(int n) {
        int prevMon = 0;
        int val = 0;
        int ans = 0;
        for(int i=1;i<=n;i++){
            if(i%7==1){
                prevMon=prevMon+1;
                val=prevMon;
            }
            ans+=val;
            val++;
        }
        return ans;
    }
}