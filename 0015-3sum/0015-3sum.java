class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i!=0 && nums[i]==nums[i-1]) continue;
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum>0) k--;
                else if(sum<0) j++;
                else{
                    ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]) j++;
                    while(j<k && nums[k]==nums[j+1]) k--;
                }
            }
        }
        return ans;
        // Arrays.sort(nums);
        // int i=0, j=1, k=nums.length-1;
        // List<List<Integer>> ans=new ArrayList<>();
        // while(i<nums.length-2){
        //     int sum=nums[i]+nums[j]+nums[k];
        //     while(sum>0 && k>0){
        //         sum-=nums[k--];
        //         sum+=nums[k];
        //     }
        //     while(sum<0 && j<nums.length-1){
        //         sum-=nums[j++];
        //         sum+=nums[j];
        //     }
        //     if(sum==0 && j<k) {
        //         ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
        //         j++;
        //         while(j<nums.length && nums[j]==nums[j-1]) j++;
        //         k--;
        //         while(k>=0 && nums[k]==nums[k+1]) k--;
        //     }
        //     if(k<=j){
        //         i++;
        //         while(i<nums.length && nums[i]==nums[i-1]) i++;
        //         j=i+1;
        //         k=nums.length-1;
        //     }
        // }
        // return ans;


        // HashSet<List<Integer>> set=new HashSet<>();
        // int len=nums.length;
        // for(int i=0;i<len;i++){
        //     for(int j=i+1;j<len;j++){
        //         for(int k=j+1;k<len;k++){
        //             if(nums[i]+nums[j]+nums[k]==0){
        //                 List<Integer> triplet=Arrays.asList(nums[i],nums[j],nums[k]);
        //                 Collections.sort(triplet);
        //                 set.add(triplet);
        //             }
        //         }
        //     }
        // }
        // ArrayList<List<Integer>> ans=new ArrayList<>(set);
        // return ans;
    }
}