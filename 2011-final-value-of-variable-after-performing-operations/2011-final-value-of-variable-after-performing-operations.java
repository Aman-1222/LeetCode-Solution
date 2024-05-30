class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int cnt=0;
        for(int i=0;i<operations.length;i++){
            for(int j=0;j<3;j++)
                if(operations[i].charAt(j)=='+'){
                    cnt++;
                    break;
                }
                else if(operations[i].charAt(j)=='-'){
                    cnt--;
                    break;
                }
        }
        return cnt;
    }
}