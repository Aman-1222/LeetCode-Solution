class Solution {
    public int findFinalValue(int[] nums, int original) {
        int ans=original;
        int i=0;
        while(i<nums.length){
            if(nums[i]==ans){
                ans=2*ans;
                i=0;
                continue;
            }
            i++;
        }
        return ans;
    }
}