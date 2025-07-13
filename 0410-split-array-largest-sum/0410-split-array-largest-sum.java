class Solution {
    public int splitArray(int[] nums, int k) {
        int low=0;
        int high=0;
        for(int i=0;i<nums.length;i++){
            low=Math.max(low,nums[i]);
            high+=nums[i];
        }

        while(low<=high){
            int mid=low+(high-low)/2;
            if(totalSubarray(nums,k,mid)) low=mid+1;
            else high=mid-1;
        }
        return low;
    }

    public static boolean totalSubarray(int []nums,int k,int val){
        int total=nums[0];
        int cnt=1;
        for(int i=1;i<nums.length;i++){
            if(total+nums[i]<=val)
                total+=nums[i];
            else{
                cnt++;
                total=nums[i];
            }
        }
        return (cnt>k);
    }
}