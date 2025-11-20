class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=Math.abs(nums[i]);
        }
        long ans=0;
        Arrays.sort(nums);
        int i=0;
        while(i<nums.length/2){
            ans-=nums[i]*nums[i];
            i++;
        }
        while(i<nums.length){
            ans+=nums[i]*nums[i];
            i++;
        }
        return ans;
    }
}