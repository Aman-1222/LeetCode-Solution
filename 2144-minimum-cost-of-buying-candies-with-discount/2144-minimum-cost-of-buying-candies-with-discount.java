class Solution {
    public int minimumCost(int[] cost) {
        int cnt=0;
        int ans=0;
        Arrays.sort(cost);
        for(int i=cost.length-1;i>=0;i--){
            if(cnt==2){
                cnt=0;
                continue;
            }
            ans+=cost[i];
            cnt++;
        }
        return ans;
    }
}