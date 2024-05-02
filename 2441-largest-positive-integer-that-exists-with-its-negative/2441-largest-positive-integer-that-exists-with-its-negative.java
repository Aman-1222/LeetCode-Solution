class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int maxi=-1;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            if(set.contains(-nums[i])) maxi=Math.max(maxi,Math.abs(nums[i]));
        }
        return maxi;
    }
}