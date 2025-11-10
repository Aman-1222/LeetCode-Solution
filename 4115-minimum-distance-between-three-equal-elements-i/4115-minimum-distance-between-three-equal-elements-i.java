class Solution {
    public int minimumDistance(int[] nums) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int a=-1,b=-1;
            int j=i+1;
            while(j<nums.length){
                if(nums[j]==nums[i]){
                    a=j;
                    break;
                }
                j++;
            }
            j++;
            while(j<nums.length){
                if(nums[j]==nums[i]){
                    b=j;
                    break;
                }
                j++;
            }
            if(a!=-1 && b!=-1) ans=Math.min(ans,2*b-2*i);
        }
        return ans!=Integer.MAX_VALUE?ans:-1;
    }
}