class Solution {
    public boolean isPalindrome(String s) {
        // String s1=new String(s);
        // s1=s1.toLowerCase();
        // String ans="";
        // for(int i=0;i<s1.length();i++){
        //     if((s1.charAt(i)>='a' && s1.charAt(i)<='z') || (s1.charAt(i)>='0' && s1.charAt(i)<='9'))                      ans+=s1.charAt(i);
        // }
        // String rev="";
        // for(int i=ans.length()-1;i>=0;i--){
        //     rev+=ans.charAt(i);
        // }
        // if(ans.equals(rev)) return true;
        // else return false;
        
        
        int start=0;
        int last=s.length()-1;
        while(start<=last){
            int firstChar=s.charAt(start);
            int secChar=s.charAt(last);
            if(!Character.isLetterOrDigit(firstChar)) start++;
            else if(!Character.isLetterOrDigit(secChar)) last--;
            else {
                if(Character.toLowerCase(firstChar)==Character.toLowerCase(secChar)) {
                    start++;
                    last--;
                }
                else return false;
            }
        }
        return true;
    }
}