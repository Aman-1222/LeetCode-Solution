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

// class Solution {
// public:
//     int maximumEnergy(vector<int>& energy, int k) {
//         unordered_map<int,int>m;
//         for(int i=0;i<energy.size();i++)
//         {
//             m[i%k]+=energy[i];
//         }
//         int maxi=INT_MIN;
//         for(int i=0;i<energy.size();i++)
//         {
//             maxi=max(maxi,m[i%k]);
//             m[i%k]-=energy[i];
//         }
//         return maxi;
//     }
// };