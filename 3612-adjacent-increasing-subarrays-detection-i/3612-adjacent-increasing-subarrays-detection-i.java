class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        if(k==1) return true;
        int cnt=1;
        for(int i=0;i<nums.size()-k-1;i++){
            if(nums.get(i)<nums.get(i+1) && nums.get(i+k)<nums.get(i+k+1))
                cnt++;
            else cnt=1;
            if(cnt==k) return true;
        }
        return false;
    }
}