class Solution {
    public int islandPerimeter(int[][] grid) {
        int cnt=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    cnt+=4;
                    if(j<grid[i].length-1 && grid[i][j+1]==1) cnt-=1;
                    if(i<grid.length-1 && grid[i+1][j]==1) cnt-=1;
                    if(i>0 && grid[i-1][j]==1) cnt-=1;
                    if(j>0 && grid[i][j-1]==1) cnt-=1;
                }
            }
        }
        return cnt;
    }
}