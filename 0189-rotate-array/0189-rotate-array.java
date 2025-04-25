class Solution {
    public void reverse(int arr[],int start,int end){
        while(start<end){
            int temp =arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int len=nums.length;
        if(k>0){
            reverse(nums,0,len-k-1);
            reverse(nums,len-k,len-1);
            reverse(nums,0,len-1);
        }
    }
}