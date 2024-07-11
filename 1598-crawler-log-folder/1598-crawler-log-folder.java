class Solution {
    public int minOperations(String[] logs) {
        int count=0;
        for(int i=0;i<logs.length;i++){
            if(logs[i].charAt(0)=='.' && logs[i].charAt(1)=='.' && count>0) count--;
            else if(logs[i].charAt(0)=='.') continue;
            else count++;
        }
        return count;
    }
}