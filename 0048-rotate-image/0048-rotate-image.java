class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix[0].length-1;i++){
            for(int j=i+1;j<matrix[0].length;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        int left=0, right=matrix[0].length-1;
        while(left<right){
            for(int i=0;i<matrix[0].length;i++){
                int temp=matrix[i][right];
                matrix[i][right]=matrix[i][left];
                matrix[i][left]=temp;
            }
            left++;
            right--;
        }
    }
}