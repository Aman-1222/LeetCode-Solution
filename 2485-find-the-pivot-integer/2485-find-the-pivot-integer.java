class Solution {
    public int pivotInteger(int n) {
        if (n==1) return 1;
        for(int i=1;i<=n;i++)
            if(sum(i,n)) return i;
        return -1;
    }
    
    public boolean sum(int pivot,int num){
        int startSum=0, endSum=0;
        for(int i=1;i<=pivot;i++) startSum+=i;
        for(int i=pivot;i<=num;i++) endSum+=i;
        return startSum==endSum;
    }
}