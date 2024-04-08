class Solution {
    public int findMin(int[] nums) {
        int minValue=Integer.MAX_VALUE;
        int low=0, high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>=nums[low]){
              minValue=Math.min(minValue,nums[low]);
                low=mid+1;
            }
            else{
              minValue=Math.min(nums[mid],minValue);
                high=mid-1;
            }
        }
        return minValue;
    }
}