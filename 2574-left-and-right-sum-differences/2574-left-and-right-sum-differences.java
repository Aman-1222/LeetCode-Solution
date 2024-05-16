class Solution {
    public int[] leftRightDifference(int[] nums) {
        int len=nums.length;
        int leftSum[]=new int[len];
        int rightSum[]=new int[len];
        for(int i=1;i<len;i++){
            leftSum[i]=leftSum[i-1]+nums[i-1];
            rightSum[len-1-i]=rightSum[len-i]+nums[len-i];
        }
        for(int i=0;i<nums.length;i++)
            nums[i]=Math.abs(leftSum[i]-rightSum[i]);
        return nums;
    }
}