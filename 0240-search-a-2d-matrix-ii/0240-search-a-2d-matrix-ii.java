class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length-1;
        int n=matrix[0].length-1;
        int i=0;
        while(n>=0 && i<=m){
            if(matrix[i][n]==target) return true;
            else if(matrix[i][n]>target) n--;
            else i++;
        }
        return false;
    }
}