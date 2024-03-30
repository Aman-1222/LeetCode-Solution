class Solution {
    public void rotate(int[][] matrix) {
        int len=matrix.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
       
        for(int i=0;i<len;i++){
             int low=0, high=len-1;
             while(low<high){
                 int temp=matrix[i][low];
                 matrix[i][low]=matrix[i][high];
                 matrix[i][high]=temp;   
                 low++;
                 high--;
             }
        }
    }
}