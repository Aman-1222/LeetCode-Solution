class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int ind=0;
        for(int i=0;i<len;i++){
            if(nums[i]!=val){
                nums[ind]=nums[i];
                ind++;
            }
        }
        return ind;
    }
}