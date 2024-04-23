class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        if(len==0) return 0;
        int low=0,high=len-1;
        while(low<=high){
            while(low<len && nums[low]!=val) low++;
            while(high>=0 && nums[high]==val) high--;
            if(low<=high){
                int temp=nums[low];
                nums[low]=nums[high];
                nums[high]=temp;
            }
            
        }
        return high+1;
    }
}