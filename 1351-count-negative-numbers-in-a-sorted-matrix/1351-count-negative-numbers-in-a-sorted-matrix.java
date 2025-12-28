class Solution {
    public int countNegatives(int[][] grid) {
        int ans=0;
        int row=grid.length-1;
        int col=grid[0].length-1;
        int i=0;
        while(row>=0 && i<=col){
            if(grid[row][i]<0){
                ans+=col-i+1;
                row--;
            }
            else i++; 
        }
        return ans;
    }
}