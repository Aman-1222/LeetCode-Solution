class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;
        if(row*col!=r*c) return mat;
        if(row==r && col==c) return mat;
        int [][]ans = new int[r][c];
        int num=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ans[i][j]=mat[num/col][num%col];
                num++;
            }
        }
        return ans;
    }
}