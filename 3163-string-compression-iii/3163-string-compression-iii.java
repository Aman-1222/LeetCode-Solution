class Solution {
    public String compressedString(String word) {
        word=word+".";
        String comp="";
        int cnt=1;
        for(int i=0;i<word.length()-1;i++){
            if(word.charAt(i+1)==word.charAt(i)){
                cnt++;
                if(cnt==9){
                    comp=comp+cnt+word.charAt(i);
                    cnt=1;
                    i++;
                }
            }
            else{
                comp=comp+cnt+word.charAt(i);
                cnt=1;
            }
        }
        return comp;
    }
}