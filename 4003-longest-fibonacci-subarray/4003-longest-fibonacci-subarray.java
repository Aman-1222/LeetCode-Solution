class Solution {
    public int longestSubarray(int[] nums) {
        int cnt=2;
        int ans=2;
        for(int i=2;i<nums.length;i++){
            if(nums[i]==nums[i-1]+nums[i-2]) cnt++;
            else{
                ans=Math.max(ans,cnt);
                cnt=2;
            }
        }
        return Math.max(ans,cnt);
    }
}