class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=0, sum=0;
        for(int i=0;i<weights.length;i++){
            max=Math.max(weights[i],max);
            sum+=weights[i];
        }
        while(max<=sum){
            int mid=max+(sum-max)/2;
            if(shipPossible(weights,days,mid)) sum=mid-1;
            else max=mid+1;
        }
        return max;
    }

    public boolean shipPossible(int []weights,int days,int wt){
        int loads=0;
        int daysRequired=1;
        for(int i=0;i<weights.length;i++){
            if(weights[i]+loads>wt){
                daysRequired++;
                loads=weights[i];
            }
            else loads+=weights[i];
        }
        return daysRequired<=days;
    }

}