class Solution {
    public boolean canJump(int[] nums) {
        int maxInd=0;
        for(int i=0;i<nums.length;i++){
            if(i>maxInd) return false;
            if(maxInd>=nums.length-1) return true;
            maxInd=Math.max(maxInd,i+nums[i]);
        }
        return true;
    }
}