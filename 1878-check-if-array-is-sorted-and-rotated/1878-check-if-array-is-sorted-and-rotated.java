class Solution {
    public boolean check(int[] nums) {
        int ind = -1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                ind=i+1;
                break;
            }
        }
        if(ind==-1) return true;
        for(int i=ind;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
        return nums[0]>=nums[nums.length-1];
    }
}