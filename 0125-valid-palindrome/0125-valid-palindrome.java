class Solution {
    public boolean isPalindrome(String s) {
        String str=s.toLowerCase();
        int start=0,end=str.length()-1;
        while(start<=end){
            if(!Character.isLetterOrDigit(str.charAt(start))) start++;
            else if(!Character.isLetterOrDigit(str.charAt(end))) end--;
            else{
                if(str.charAt(start)!=str.charAt(end)) return false;
                start++;
                end--;
            }
        }
        return true;
    }
}