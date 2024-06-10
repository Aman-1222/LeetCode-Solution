class Solution {
    public int heightChecker(int[] heights) {
        int cnt=0;
        int arr[]=heights.clone();
        for(int i=0;i<arr.length;i++){
            boolean flag= true;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=false;
                }
            }
                if(flag) break;
        }
        for(int i=0;i<heights.length;i++)
            if(arr[i]!=heights[i]) cnt++;
        return cnt;
    }
}