class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int ans=0;
        for(int i=0;i<k;i++)
            ans+=cardPoints[i];
        int sum=ans;
        int rIndex=cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            sum-=cardPoints[i];
            sum+=cardPoints[rIndex];
            ans=Math.max(sum,ans);
            rIndex--;
        }
        return ans;
    }
}