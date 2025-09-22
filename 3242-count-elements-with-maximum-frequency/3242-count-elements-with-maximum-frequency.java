class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int cnt=0;
        int max=0;
        for(int mpp:map.values()){
            if(mpp>max){
                cnt=mpp;
                max=mpp;
        }
            else if(mpp==max) cnt+=mpp;
        }
        return cnt;
    }
}