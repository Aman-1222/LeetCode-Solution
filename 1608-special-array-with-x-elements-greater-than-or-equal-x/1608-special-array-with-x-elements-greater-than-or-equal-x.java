class Solution {
    public int specialArray(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++)
            max=Math.max(max,nums[i]);
        for(int i=0;i<=max;i++){
            int cnt=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]>=i) cnt++;
            }
            if(cnt==i) return cnt;
        }
        return -1;
    }
}