class Solution {
    public int majorityElement(int[] nums) {
        int cnt= 0;
        int majEle = 0;
        for(int i=0;i<nums.length;i++){
            if(cnt==0){
                majEle=nums[i];
                cnt++;
            }
            else if(nums[i]==majEle) cnt++;
            else cnt--;
        }
        return majEle;
    }
}