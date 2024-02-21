class Solution {
    public boolean isPalindrome(int x) {
        String digit=""+x;
        int len=digit.length()-1;
        int i=0;
        while(i<=len){
            if(digit.charAt(i)!=digit.charAt(len))  return false;
            i++;
            len--;
            }
        return true;
    }
}