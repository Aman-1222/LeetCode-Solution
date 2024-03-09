class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        for(int i=0;i<nums1.length;i++){
            if(isCommonInteger(nums2,nums1[i])) return nums1[i];
        }
        return -1;
    }
    boolean isCommonInteger(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target) return true;
            else if(nums[mid]>target) high=mid-1;
            else low=mid+1;
        }
        return false;
    }
}