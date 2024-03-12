class Solution {
    public int[] twoSum(int[] nums, int target) {
    HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int find=target-nums[i];
            if(mpp.containsKey(find)) return new int[]{mpp.get(find),i};
            mpp.put(nums[i],i);      
        }
        return new int[]{-1,-1};
    }
}