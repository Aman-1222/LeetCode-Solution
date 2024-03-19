class Solution {
    public int majorityElement(int[] nums) {
        int cnt= 1;
        int majEle = nums[0];
        for(int i=1;i<nums.length;i++){
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