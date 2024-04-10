class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(((long)m*k)>bloomDay.length) return -1;
        int low=Integer.MAX_VALUE, high=0;
        for(int i=0;i<bloomDay.length;i++){
            low=Math.min(low,bloomDay[i]);
            high=Math.max(high,bloomDay[i]);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(possible(bloomDay,mid,m,k)) high=mid-1;
            else low=mid+1;
        }
        return low;
    }
    public boolean possible(int[] arr,int day,int m,int k){
        int cnt=0,bouq=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=day) cnt++;
            else{
                bouq+=cnt/k;
                cnt=0;
            }
        }
        bouq+=cnt/k;
        // if(bouq>=m) return true;
        // else return false;
        return (bouq>=m);
    }
}