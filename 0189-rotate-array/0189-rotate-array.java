class Solution {
    public void rotate(int[] nums, int k) {
        int len=nums.length;
        k=k%len;
        if(k==0) return;
        reverse(nums,0,len-1);
        reverse(nums,0,k-1);
        reverse(nums,k,len-1);
    }
    public void reverse(int[] arr,int start,int end){
       while(start<end){
           int temp=arr[start];
           arr[start]=arr[end];
           arr[end]=temp;
           start++;
           end--;
       } 
    }
}