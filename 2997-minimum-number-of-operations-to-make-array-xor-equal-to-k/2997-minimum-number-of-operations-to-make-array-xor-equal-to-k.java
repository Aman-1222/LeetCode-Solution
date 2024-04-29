class Solution {
    public int minOperations(int[] nums, int k) {
        int xor=k;
        for(int i=0;i<nums.length;i++){
            xor=xor^nums[i];
        }
        int cnt=0;
        while(xor!=0){
            cnt+=xor&1;
            xor=xor>>1;
        }
        return cnt;
    }
}