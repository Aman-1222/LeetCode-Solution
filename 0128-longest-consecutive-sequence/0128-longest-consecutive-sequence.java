class Solution {
    public int longestConsecutive(int[] nums) {
        int ans=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++) set.add(nums[i]);
        for(int i:set){
            int cnt=1;
            if(!set.contains(i-1)){
                while(set.contains(i+1)){
                    cnt++;
                    i++;
                }
            }
            ans=Math.max(ans,cnt);
        }
        return ans;
    }
}