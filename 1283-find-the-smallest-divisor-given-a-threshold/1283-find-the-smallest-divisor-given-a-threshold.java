class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1,high=-1;
        for(int i=0;i<nums.length;i++)
            high=Math.max(high,nums[i]);
        while(low<=high){
            int mid=low+(high-low)/2;
            if(possible(nums,mid,threshold)) high=mid-1;
            else low=mid+1;
        }
        return low;
    }
    public boolean possible(int[] arr,int div,int threshold){
        int cnt=0;
        for(int i=0;i<arr.length;i++)
            cnt+=Math.ceil((double)arr[i]/div);
        return cnt<=threshold;
    }
}