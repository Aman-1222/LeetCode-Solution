class Solution {
    public int[] sortedSquares(int[] nums) {
        int ans[]=new int[nums.length];
        int left=0;
        int right=nums.length-1;
        int index=nums.length-1;
        while(left<=right){
            int tempL=nums[left]*nums[left];
            int tempR=nums[right]*nums[right];
            if(tempL>=tempR){
                ans[index]=tempL;
                left++;
                index--;
            }
            else{
                ans[index]=tempR;
                right--;
                index--;            
        }
        }
            return ans;
    }
}