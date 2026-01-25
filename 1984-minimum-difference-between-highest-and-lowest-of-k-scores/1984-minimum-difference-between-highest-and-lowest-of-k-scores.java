class Solution {
    public int minimumDifference(int[] nums, int k) {
        int ans=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=k-1;i--){
            ans=Math.min(nums[i]-nums[i-k+1],ans);
        }
        return ans;
    }
}