class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int len=energy.length;
        int ans=Integer.MIN_VALUE;
        for(int i=len-1;i>=len-k;i--){
            int pos=0,neg=0;
            int sum=energy[i];
            for(int j=i-k;j>=0;j-=k){
                if(energy[j]<0) neg+=energy[j];
                else pos+=energy[j];
                if(pos>-neg) {
                    sum+=pos+neg;
                    pos=0;
                    neg=0;
                }
            }
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}