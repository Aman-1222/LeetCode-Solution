class Solution {
    public int minCost(String colors, int[] neededTime) {
        int ans=0;
        for(int i=0;i<colors.length()-1;i++){
           int max=neededTime[i];
           int sum=neededTime[i];
           while(i<colors.length()-1 && colors.charAt(i)==colors.charAt(i+1)){
                sum+=neededTime[i+1];
                max=Math.max(max,neededTime[i+1]);
                i++;
           }
           ans+=sum-max;
        }
        return ans;
    }
}