class Solution {
    public int minimumChairs(String s) {
        int cnt=0, min=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='E') cnt++;
            else cnt--;
            min=Math.max(cnt,min);
            }
        return min;
    }
}