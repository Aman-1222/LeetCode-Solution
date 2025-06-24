class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int ele1=Integer.MIN_VALUE;
        int ele2=Integer.MIN_VALUE;
        int cnt1=0; 
        int cnt2=0;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(cnt1==0 && ele2!=nums[i]){
                cnt1++;
                ele1=nums[i];
            }
            else if(cnt2==0 && ele1!=nums[i]){
                cnt2++;
                ele2=nums[i];
            }
            else if(nums[i]==ele1) cnt1++;
            else if(nums[i]==ele2) cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;
        cnt2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==ele1) cnt1++;
            else if(nums[i]==ele2) cnt2++;
        }
        if(cnt1>nums.length/3) ans.add(ele1);
        if(cnt2>nums.length/3) ans.add(ele2);
        return ans;
    }
}