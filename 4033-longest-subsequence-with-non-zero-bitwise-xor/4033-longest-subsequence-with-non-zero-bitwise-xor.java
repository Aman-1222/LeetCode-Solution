class Solution {
    
    public int longestSubsequence(int[] nums) {
        int xor=0;
        boolean flag=true;
        for(int i=0;i<nums.length;i++) {
            xor^=nums[i];
            if(nums[i]!=0) flag=false;
        }
        if(flag) return 0;
        if(xor==0) return nums.length-1;
        return nums.length;
    }
}