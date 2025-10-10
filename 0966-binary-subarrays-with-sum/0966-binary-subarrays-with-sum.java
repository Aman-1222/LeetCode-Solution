class Solution {
    public int sumUtil(int nums[], int goal){
        if(goal<0) return 0;
        int l=0, r=0, ans=0, sum=0;
        while(r<nums.length){
            sum+=nums[r];
            while(sum>goal){
                sum-=nums[l];
                l++;
            }
            ans+=r-l+1;
            r++;
        }
        return ans;
    }
    
    public int numSubarraysWithSum(int[] nums, int goal) {
        return sumUtil(nums,goal)-sumUtil(nums,goal-1);
    }
}