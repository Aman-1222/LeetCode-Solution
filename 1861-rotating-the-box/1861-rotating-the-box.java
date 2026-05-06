class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int row=boxGrid.length;
        int col=boxGrid[0].length;
        char[][] ans=new char[col][row];
        for(int i=0;i<row;i++){
            int sp=-1;
            for(int j=col-1;j>=0;j--){
                if(boxGrid[i][j]=='.'){
                    if(sp==-1) sp=j;
                } 
                else if(boxGrid[i][j]=='*') sp=-1;
                else{
                    if(sp!=-1){
                        boxGrid[i][sp]='#';
                        boxGrid[i][j]='.';
                        sp--;
                    }
                }
            }
            for(int j=0;j<col;j++)
                ans[j][row-1-i]=boxGrid[i][j];
        }
        return ans;
    }
}