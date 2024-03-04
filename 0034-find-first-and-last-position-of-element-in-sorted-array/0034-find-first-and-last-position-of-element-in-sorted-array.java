class Solution {
    public int[] searchRange(int[] nums, int target) {
        int len=nums.length;
        if(len==0) return new int[]{-1,-1};
        int firstPos=firstPosition(nums,len,target);
        if(firstPos==-1) return new int[]{-1,-1};
        int lastPos=lastPosition(nums,len,target);
        return new int[]{firstPos,lastPos};
    }
    public static int firstPosition(int[] nums,int len,int target){
        int low=0;
        int high=len-1;
        int index=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target) {
                index=mid;
                high=mid-1;
            }
            else if(nums[mid]<target) low=mid+1;
            else high=mid-1;
        }
        return index;
    }
        public static int lastPosition(int[] nums,int len,int target){
        int low=0;
        int high=len-1;
        int index=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target) {
                index=mid;
                low=mid+1;
            }
            else if(nums[mid]<target) low=mid+1;
            else high=mid-1;
        }
        return index;
    }
}