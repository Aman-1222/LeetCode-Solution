class Solution {
    public boolean search(int[] nums, int target) {
        int len=nums.length;
        int low=0,high=len-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target) return true;
            if(nums[low]==nums[mid] && nums[mid]==nums[high]){
                high--;
                low++;
                continue;
            }
            if(nums[mid]<=nums[high]){
                if(nums[mid]<=target && target<=nums[high]) low=mid+1;
                else high=mid-1;
            }
            else{
                if(nums[low]<=target && target<=nums[mid]) high=mid-1;
                else low=mid+1;
            }
        }
        return false;
    }
}