class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        while(i<nums.length-1){
            if(nums[i]==nums[i+1]) break; 
            i++;
        }
        int j=i+1;
        while(j<nums.length){
            if(nums[j]!=nums[i]){
                nums[++i]=nums[j];
            }
            j++;
        }
        return i+1;
    }
}