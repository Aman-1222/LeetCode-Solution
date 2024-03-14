class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        mpp.put(0,1);
        int sum=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int req=sum-goal;
            if(mpp.containsKey(req)) ans+=mpp.get(req);
            mpp.put(sum,mpp.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}