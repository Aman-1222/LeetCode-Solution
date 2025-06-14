class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length) return -1;
        int low=bloomDay[0], high=bloomDay[0];
        for(int i=1;i<bloomDay.length;i++){
            low=Math.min(bloomDay[i],low);
            high=Math.max(bloomDay[i],high);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(bouquetsPossible(bloomDay,m,k,mid)) high=mid-1;
            else low=mid+1;
        }
        return low;
    }

    public boolean bouquetsPossible(int bloomDay[], int m,int k,int day){
        int cnt=0;
        int bouquets=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=day) cnt++;
            else{
                bouquets+=cnt/k;
                cnt=0;
            }
        }
        bouquets+=cnt/k;
        return bouquets>=m;
    }
}