class Solution {
public:
    int maxIncreasingSubarrays(vector<int>& nums) {
        int maxi=1;
        int prev=0;
        int cur=1;
        for(int i=1;i<nums.size();i++)
        {
            if(nums[i]>nums[i-1])
            {
                cur++;
            }
            else
            {
                int val=min(prev,cur);
                maxi=max(maxi,val);
                maxi=max(maxi,cur/2);
                prev=cur;
                cur=1;
            }
        }
        int val=min(prev,cur);
        maxi=max(maxi,val);
        maxi=max(maxi,cur/2);
        return maxi;
    }
};