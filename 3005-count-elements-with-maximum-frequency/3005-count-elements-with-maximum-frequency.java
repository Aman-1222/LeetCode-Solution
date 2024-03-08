class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int cnt=0;
        int max=0;
        for(Map.Entry<Integer,Integer> mpp:map.entrySet()){
            if(mpp.getValue()>max){
                cnt=mpp.getValue();
                max=mpp.getValue();
        }
            else if(mpp.getValue()==max) cnt+=mpp.getValue();
        }
        return cnt;
    }
}