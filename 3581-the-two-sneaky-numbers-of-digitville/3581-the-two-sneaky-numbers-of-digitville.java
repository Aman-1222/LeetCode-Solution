class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        int ans[]=new int[2];
        int cnt=0;
        for(int i=1;i<nums.length;i++)
            if(nums[i]==nums[i-1]){ 
                ans[cnt]=nums[i];
                cnt++;
        }
        return ans;
    }
}