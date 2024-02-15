class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long sum=0;
     for(int i=0;i<nums.length;i++){
         sum+=nums[i];
     }
        int flag=0;
     for(int i = nums.length-1;i>1;i--){
        if(sum-nums[i]> nums[i]){
            flag=1;
            break;
        }
         sum-=nums[i];
        }
        if(flag==1) return sum;
        return -1;
        
    }
}
