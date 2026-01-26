class Solution {
    public int minimumPrefixLength(int[] nums) {
        int ans=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]) ans=i;
        }
        return ans;
    }
}