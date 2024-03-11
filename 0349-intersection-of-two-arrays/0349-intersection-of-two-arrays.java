class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            mpp.put(nums1[i],1);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(mpp.getOrDefault(nums2[i],0)==1){
             mpp.put(nums2[i],2);
             ans.add(nums2[i]);
            }
        }
        int[] arr=new int[ans.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=ans.get(i);
        }
        return arr;
    }
}