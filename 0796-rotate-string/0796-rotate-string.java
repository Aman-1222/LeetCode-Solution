class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        char ch = s.charAt(0);
        int len=goal.length();
        for(int i=0;i<len;i++){
            if(goal.charAt(i)==ch) {
                if(goal.substring(i,len).equals(s.substring(0,len-i)) && 
                   goal.substring(0,i).equals(s.substring(len-i,len))) return true;
        }
    }
    return false;
}
}