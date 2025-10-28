class Solution {
    public int numberOfBeams(String[] bank) {
        int prev=0;
        int cur=0;
        int ans=0;
        for(int i=0;i<bank.length;i++){
            for(int j=0;j<bank[i].length();j++){
                if(bank[i].charAt(j)=='1') cur++;
            }
            if(cur!=0){
                ans+=cur*prev;
                prev=cur;
                cur=0;
            }
        }
        return ans;
    }
}