class Solution {
    public int minDifference(int[] nums) {
        int len=nums.length;
        int diff=Integer.MAX_VALUE;
        if(len<=3) return 0;
        Arrays.sort(nums);
        for(int i=0;i<=len/2;i++){
            if(i!=0 && nums[i]==nums[i-1]) continue;
            int h=((i%len)+len-4)%len;
            int d=nums[h]-nums[i];
            if(d>=0)
                diff=Math.min(d,diff);
        }
        return diff;
    }
}