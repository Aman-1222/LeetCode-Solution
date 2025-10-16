class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int prevcnt=1 , curcnt=1;
        int ans=1;
       for(int i=1;i<nums.size();i++){
            if(nums.get(i)<=nums.get(i-1)){
                int a = Math.min(prevcnt,curcnt);
                int b = Math.max(prevcnt/2,curcnt/2);
                ans = Math.max(ans,Math.max(a,b));
                prevcnt=curcnt;
                curcnt=1;
            }
            else curcnt++;
        }
        int a = Math.min(prevcnt,curcnt);
        int b = Math.max(prevcnt/2,curcnt/2);
        return ans = Math.max(ans,Math.max(a,b));
    }
}