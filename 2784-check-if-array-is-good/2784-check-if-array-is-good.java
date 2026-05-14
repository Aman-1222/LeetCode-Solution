class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length;
        if(len==1) return false;
        for(int i=1;i<len-1;i++)
            if(nums[i]!=nums[i-1]+1) return false;
        if(nums[len-2]!=nums[len-1] || nums[len-1]!=len-1) return false;
        return true;
    }
}