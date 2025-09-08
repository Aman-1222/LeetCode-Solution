class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]) nums1[k--]=nums1[i--];
            else nums1[k--]=nums2[j--];
        }
        
        // int arr[] = new int[m];
        // for(int i=0;i<m;i++) arr[i]=nums1[i];
        // int ind=0;
        // int i=0;
        // int j=0;
        // while(i<m && j<n){
        //     if(arr[i]<=nums2[j]) {
        //         nums1[ind]=arr[i];
        //         i++;
        //     }
        //     else {
        //         nums1[ind]=nums2[j];
        //         j++;
        //     }
        //     ind++;
        // }
        // while(i<m){
        //     nums1[ind]=arr[i];
        //     i++;
        //     ind++;
        // }
        // while(j<n){
        //     nums1[ind]=nums2[j];
        //     j++;
        //     ind++;
        //}
    }
}