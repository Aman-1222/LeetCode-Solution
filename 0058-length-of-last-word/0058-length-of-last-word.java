class Solution {
    public int lengthOfLastWord(String s) {
        int ans=0;
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ' && cnt!=0) {
                ans=cnt;
                cnt=0;
            }
            else if(s.charAt(i)!=' ') cnt++;
        }
        if(cnt>0) return cnt;
        return ans;
    }
}