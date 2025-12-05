class Solution {
    public int countPartitions(int[] nums) {
        int rightSum=0;
        for(int i:nums) rightSum+=i;
        int cnt=0;
        int leftSum=0;
        for(int i=0;i<nums.length-1;i++){
            leftSum+=nums[i];
            rightSum-=nums[i];
            if((leftSum-rightSum)%2==0) cnt++;
        }
        return cnt;
    }
}