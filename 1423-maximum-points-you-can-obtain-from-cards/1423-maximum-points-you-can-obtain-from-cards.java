class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum=0, lSum=0, rSum=0, len=cardPoints.length-1;
        for(int i=0;i<k;i++)
            lSum+=cardPoints[i];
        sum=lSum;
        for(int i=k-1;i>=0;i--){
            lSum=lSum-cardPoints[i];
            rSum=rSum+cardPoints[len--];
            sum=Math.max(lSum+rSum,sum);
        }
        return sum;
    }
}