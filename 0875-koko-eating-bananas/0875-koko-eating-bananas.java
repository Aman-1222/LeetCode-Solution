class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int low=1, high=maxi(piles);
        while(low<=high){
            int mid=low+(high-low)/2;
            if(possible(piles,mid,h)) high=mid-1;
            else low=mid+1;
        }
        return low;
    }
    public boolean possible(int arr[],int bananas,int hour){
        int cnt=0;
        for(int i=0;i<arr.length;i++)
            cnt+=Math.ceil((double)(arr[i])/(double)(bananas));
        if(cnt<=hour) return true;
        else return false;
    }
    public int maxi(int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++) max=Math.max(max,arr[i]);
        return max;
    }
}