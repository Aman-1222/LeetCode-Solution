class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++) sum+=nums[i];
        int lsum=0;
        for(int i=0;i<nums.length;i++) {
            sum-=nums[i];
            if(lsum==sum) return i;
            lsum+=nums[i];
        }
        return -1;
    }
}