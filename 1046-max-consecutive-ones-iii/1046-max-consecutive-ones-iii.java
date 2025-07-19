class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeros=0;
        int l=0,r=0;
        int ans=0;
        while(r<nums.length){
            if(nums[r]==0) zeros++;
            if(zeros>k){
                if(nums[l]==0) zeros--;
                l++;
            }
            else ans=Math.max(ans,r-l+1);
            r++;
        }
        return ans;
    }
}