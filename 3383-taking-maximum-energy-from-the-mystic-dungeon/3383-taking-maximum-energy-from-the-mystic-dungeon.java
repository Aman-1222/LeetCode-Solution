class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int len= energy.length;
        int ans=Integer.MIN_VALUE;
        for(int i=len-k;i<len;i++){
            int sum=0;
            for(int j=i;j>=0;j=j-k){
                sum+=energy[j];
                ans=Math.max(ans,sum);
            }
        }
        return ans;



        // int ans=Integer.MIN_VALUE;
        // int len=energy.length-1;
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i=len;i>=0;i--){
        //     map.put(i,energy[i]+map.getOrDefault(i+k,0));
        //     ans=Math.max(ans,map.get(i));
        // }
        // return ans;







        // int ans=Integer.MIN_VALUE;
        // for(int i=0;i<energy.length;i++){
        //     int sum=0;
        //     for(int j=i;j<energy.length;j=j+k){
        //         sum+=energy[j];
        //     }
        //     if(sum>ans) ans=sum;
        // }
        // return ans;
    }
}