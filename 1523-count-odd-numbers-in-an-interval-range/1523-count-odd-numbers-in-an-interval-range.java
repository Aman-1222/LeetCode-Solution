class Solution {
    public int countOdds(int low, int high) {
        int ans=(high-low-1)/2;
        if(high!=low){
            if(low%2!=0) ans++;
            if(high%2!=0) ans++;
        }
        else if(high==low && high%2!=0) ans++;
        if(high%2==0 && low%2==0 && high!=low) ans++;
        return ans;
    }
}