class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int cnt=0;
        for(String s:operations)
            cnt+=s.charAt(1)=='+'? 1 : -1;
        return cnt;
    }
}