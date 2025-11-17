class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        boolean ans = true;
        int indOne = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                indOne=i;
                break;
            }
        }
        if(indOne==-1) return true;
        for(int i=indOne+1;i<nums.length;i++){
            if(nums[i]==1){
                if(i-indOne-1>=k)   indOne=i;
                else{
                    ans=false;
                    break;
                }
            }
        }
        return ans;
    }
}