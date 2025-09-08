class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[] = new int[m];
        for(int i=0;i<m;i++) arr[i]=nums1[i];
        int ind=0;
        int i=0;
        int j=0;
        while(i<m && j<n){
            if(arr[i]<=nums2[j]) {
                nums1[ind]=arr[i];
                i++;
            }
            else {
                nums1[ind]=nums2[j];
                j++;
            }
            ind++;
        }
        while(i<m){
            nums1[ind]=arr[i];
            i++;
            ind++;
        }
        while(j<n){
            nums1[ind]=nums2[j];
            j++;
            ind++;
        }
    }
}