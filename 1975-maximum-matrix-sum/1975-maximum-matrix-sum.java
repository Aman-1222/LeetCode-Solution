class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int cnt=0;
        long sum=0;
        int reduce=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]<0) cnt++;
                reduce=Math.min(reduce,Math.abs(matrix[i][j]));
                sum+=Math.abs(matrix[i][j]);
            }
        }
        if(cnt%2==0) return sum;
        return sum-2*reduce;
    }
}