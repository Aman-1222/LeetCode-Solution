class Solution {
    public void moveZeroes(int[] nums) {
        int i =-1;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==0){
                i=j;
                break;
            }
        }
        if(i==-1) return;
        for(int j=i+1;j<nums.length;j++){
            if(nums[j]!=0){
                nums[i]=nums[j];
                nums[j]=0;
                i++;
            }
        }
    }
}