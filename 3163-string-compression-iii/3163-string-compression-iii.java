class Solution {
    public String compressedString(String word) {
        word=word+".";
        StringBuilder ans = new StringBuilder();
        String comp="";
        int cnt=1;
        for(int i=0;i<word.length()-1;i++){
            char ch=word.charAt(i);
            if(cnt==9){
                ans.append(cnt).append(ch);
                    cnt=1;
                }
            else if(word.charAt(i+1)==ch)
                cnt++;
            else{
                ans.append(cnt).append(ch);
                cnt=1;
            }
        }
        return ans.toString();
    }
}