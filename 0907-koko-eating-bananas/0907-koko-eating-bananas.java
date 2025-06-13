class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int high=0;
        for(int i=0;i<piles.length;i++)
            high=Math.max(high,piles[i]);
        int low=1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int hrs=hours(piles,mid);
            if(hrs<=h) high=mid-1;
            else low=mid+1;
        }
        return low;
    }

    public int hours(int[] piles, int k){
        int hrs=0;
        for(int i=0;i<piles.length;i++)
            hrs+=Math.ceil((double)(piles[i])/k);
        return hrs;
    }
}