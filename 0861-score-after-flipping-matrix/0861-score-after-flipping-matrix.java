class Solution {
    public int matrixScore(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            if(grid[i][0]==0) flipRow(grid[i]);
        }
        for(int i=0;i<n;i++){
            if(countZeros(grid,i)) flipColumn(grid,i);
        }
        int sum=0;
        for(int i=0;i<m;i++){
            int num=n-1;
            for(int j=0;j<n;j++){
                sum+=grid[i][j]*Math.pow(2,num);
                num--;
            }
        }
        return sum;
    }
    public void flipRow(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i]==0? 1 : 0;
        }
    }
    public void flipColumn(int [][]arr,int n){
        for(int i=0; i<arr.length; i++){
            arr[i][n]= (arr[i][n]==0)? 1 : 0;
        }
    }
    public boolean countZeros(int [][]arr, int n){
        int one=0;
        int zero=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i][n]==0) zero++;
            else one++;
        }
        if(zero>one) return true;
        else return false;
    }
}