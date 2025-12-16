class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int smallest =0, largest=0;
        for(int i=0;i<k;i++){
            smallest+=nums[i];
            largest+=nums[nums.length-i-1];
        }
        return Math.abs(smallest-largest);
    }
}