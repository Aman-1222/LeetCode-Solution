class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int ans=0;
        for(int i=0;i<k;i++)
            ans+=cardPoints[i];
        int lSum=ans;
        int rSum=0;
        int rIndex=cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            lSum-=cardPoints[i];
            rSum+=cardPoints[rIndex];
            ans=Math.max(lSum+rSum,ans);
            rIndex--;
        }
        return ans;
    }
}