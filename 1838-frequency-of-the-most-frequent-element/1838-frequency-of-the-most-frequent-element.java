class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int maxLen=1;
        int count=1;
        int len=nums.length-1;
        for(int i=len;i>0;i--){
            if(i!=len&&nums[i]==nums[i+1]) continue;
            int dupk=k;
            count=1;
            for(int j=i-1;j>=0;j--){
              int sum=nums[i]-nums[j];
                if(sum>dupk) break;
                dupk-=sum;
                count++;
                maxLen=Math.max(maxLen,count);
            }
        }
        return maxLen;
    }
}