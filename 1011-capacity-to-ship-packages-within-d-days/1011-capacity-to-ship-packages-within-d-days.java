class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int high=0,low=-1;
        for(int i=0;i<weights.length;i++){
            low=Math.max(weights[i],low);
            high+=weights[i];
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(possible(weights,days,mid)) high=mid-1;
            else low=mid+1;
        }
        return low;
    }
    public boolean possible(int[] arr,int days,int n){
        int cnt=1;
        int weight=0;
        for(int i=0;i<arr.length;i++){
            if(weight+arr[i]>n){
                weight=arr[i];
                cnt++;
            }
            else weight+=arr[i];
        }
        return (cnt<=days); 
    }
}