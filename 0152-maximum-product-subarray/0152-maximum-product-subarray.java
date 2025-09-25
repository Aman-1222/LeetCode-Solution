class Solution {
    public int maxProduct(int[] nums) {
        int ans=Integer.MIN_VALUE;
        int left=1, right=1;
        int len=nums.length;
        for(int i=0;i<len;i++){
            left*=nums[i];
            right*=nums[len-i-1];
            ans=Math.max(ans,Math.max(right,left));
            if(left==0) left=1;
            if(right==0) right=1;
        }
        return ans;
    }
}