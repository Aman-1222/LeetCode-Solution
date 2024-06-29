class Solution {
    public int sumOfSquares(int[] nums) {
        int len=nums.length;
        int sum=0;
        for(int i=1;i<=len;i++)
            if(len%i==0)
                sum+=nums[i-1]*nums[i-1];
        return sum;
    }
}