class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int diag=0;
        int ans=0;
        for(int i=0;i<dimensions.length;i++){
            int val=dimensions[i][0]*dimensions[i][0]+dimensions[i][1]*dimensions[i][1];
                if(val>diag){
                    diag=val;
                    ans = dimensions[i][0]*dimensions[i][1];
                }
                else if(val==diag){
                    ans=Math.max(ans,dimensions[i][0]*dimensions[i][1]);
                }
            }
        return ans;
    }
}