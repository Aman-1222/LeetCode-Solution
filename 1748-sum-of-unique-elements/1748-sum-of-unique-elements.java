class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        for(int i=0;i<nums.length;i++)
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])>1) continue;
            sum+=nums[i];
        }
        return sum;
    }
}