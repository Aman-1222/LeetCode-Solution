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

// HashSet<Integer> set = new HashSet<Integer>();
//         ArrayList<Integer> res = new ArrayList<Integer>();
//         //Add all elements to set from array 1
//         for(int i =0; i< nums1.length; i++) set.add(nums1[i]);
//         for(int j = 0; j < nums2.length; j++) {
//            // If present in array 2 then add to res and remove from set 
//            if(set.contains(nums2[j])) {
//                 res.add(nums2[j]);
//                 set.remove(nums2[j]);
//             }
//         }
//         // Convert ArrayList to array
//         int[] arr = new int[res.size()];
//         for (int i= 0; i < res.size(); i++) arr[i] = res.get(i);
//         return arr;