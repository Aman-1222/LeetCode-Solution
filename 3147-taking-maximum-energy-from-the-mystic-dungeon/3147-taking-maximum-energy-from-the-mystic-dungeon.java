class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int len=energy.length;
        int ans=Integer.MIN_VALUE;
        for(int i=len-1;i>=len-k;i--){
            int sum=0;
            for(int j=i;j>=0;j-=k){
                sum+=energy[j];
                ans=Math.max(ans,sum);       
            }
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