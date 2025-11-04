class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return countAtMost(nums,k)-countAtMost(nums,k-1);
    }

    public int countAtMost(int nums[],int k){
        if(k<0) return 0;
        int l=0, r=0;
        int cnt=0, odd=0;

        while(r<nums.length){
            if(nums[r]%2!=0) odd++;
            while(odd>k){
                if(nums[l]%2!=0) odd--;
                l++;
            }
            cnt+=r-l+1;
            r++;
        }
        return cnt;
    }
}