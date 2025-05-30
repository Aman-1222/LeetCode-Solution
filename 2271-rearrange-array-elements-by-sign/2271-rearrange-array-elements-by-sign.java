class Solution {
    public int[] rearrangeArray(int[] nums) {
        int posInd = 0;
        int negInd = 1;
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans[posInd]=nums[i];
                posInd+=2;
            }
            else {
                ans[negInd] = nums[i];
                negInd+=2;
            }
        }
        return ans;
    }
}