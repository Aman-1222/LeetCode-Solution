class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[]=new int[2*n];
        int half=n;
        int start = 0;
        for(int i=0;i<2*n-1;i+=2){
            ans[i]=nums[start];
            ans[i+1]=nums[half];
            start++;
            half++;
        }
        return ans;
    }
}