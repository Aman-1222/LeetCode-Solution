class Solution {
    public String reversePrefix(String word, char ch) {
        String rev="";
        boolean flag= false;
        int i=0;
        for(;i<word.length();i++){
            char c=word.charAt(i);
            if(c==ch){
                rev=c+rev;
                i++;
                flag=true;
                break;
            }
            rev=c+rev;
        }
        if(flag){
        for(;i<word.length();i++)
            rev=rev+word.charAt(i);
        return rev;
        }
        return word;
    }
}