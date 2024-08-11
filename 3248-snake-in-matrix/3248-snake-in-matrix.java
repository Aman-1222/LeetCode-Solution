class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int ans=0;
        for(String i:commands){
            if(i.charAt(0)=='R') ans++;
            else if(i.charAt(0)=='L') ans--;
            else if(i.charAt(0)=='D') ans+=n;
            else ans-=n;
        }
        return ans;
    }
}