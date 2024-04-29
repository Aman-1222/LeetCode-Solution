class Solution {
    public int minOperations(int[] nums, int k) {
        int xor=nums[0];
        for(int i=1;i<nums.length;i++){
            xor=xor^nums[i];
        }
        xor=xor^k;
        int cnt=0;
        while(xor!=0){
            cnt+=xor&1;
            xor=xor>>1;
        }
        return cnt;
    }
}