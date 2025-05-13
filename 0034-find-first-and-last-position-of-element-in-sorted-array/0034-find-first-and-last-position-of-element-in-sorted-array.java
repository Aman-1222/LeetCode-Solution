class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{firstOccur(nums,target),lastOccur(nums,target)};
    }

    public int firstOccur(int nums[], int target){
        int low=0,high=nums.length-1;
        boolean flag=false;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                high=mid-1;
                flag=true;
                
            } 
            if(nums[mid]<target) low=mid+1;
            else high=mid-1;
        }
        return (flag)? low : -1;
    }
    public int lastOccur(int nums[], int target){
        int low=0,high=nums.length-1;
        boolean flag=false;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                low=mid+1;
                flag=true;
                continue;
            }
            if(nums[mid]<target) low=mid+1;
            else high=mid-1;
        }
        return (flag)? high : -1;
    }
}