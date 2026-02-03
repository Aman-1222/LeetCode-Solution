class Solution {
    public boolean isTrionic(int[] nums) {
        int cnt=0;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]==nums[i-1] || nums[i]==nums[i+1]) return false;
           if((nums[i]>nums[i-1] && nums[i]>nums[i+1]) || (nums[i]<nums[i-1] && nums[i]<nums[i+1])){
                if(cnt==0){
                    if(nums[i]<nums[i-1]) return false;
                }
                cnt++;   
           }
                
        }
        return cnt==2;
    }
}