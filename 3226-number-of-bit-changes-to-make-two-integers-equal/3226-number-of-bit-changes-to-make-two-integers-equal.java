class Solution {
    public int minChanges(int n, int k) {
        if(n<k) return -1;
        int cnt=0;
        while(n!=0){
            if((n&1) != (k&1) && (n&1) == 1) cnt++;
            else if((n&1)!= (k&1) && (n&1)==0) return -1;
            n=n>>1;
            k=k>>1;
            
        }
        return cnt;
    }
}
