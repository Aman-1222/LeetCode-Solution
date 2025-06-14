class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max=0;
        for(int i=0;i<nums.length;i++)
            max=Math.max(nums[i],max);
        int low=1, high=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(checkDivisor(nums,mid,threshold)) high=mid-1;
            else low=mid+1;
        }
        return low;
    }

    public boolean checkDivisor(int nums[],int divisor,int threshold){
        int sum=0;
        for(int i=0;i<nums.length;i++)
            sum+=(nums[i]+divisor-1)/divisor;
        return (sum<=threshold);
    }
}