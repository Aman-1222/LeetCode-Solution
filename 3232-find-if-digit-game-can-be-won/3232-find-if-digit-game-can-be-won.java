class Solution {
    public boolean canAliceWin(int[] nums) {
        int sgle=0;
        int dble=0;
        for(int i=0;i<nums.length;i++)
            if(nums[i]/10>0) dble+=nums[i];
            else sgle+=nums[i];
        return sgle==dble ? false : true; 
    }
}