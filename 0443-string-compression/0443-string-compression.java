class Solution {
    public int compress(char[] chars) {
        String val="";
        for(int i=0;i<chars.length;i++)
            val+=chars[i];
        val=val+" ";
        String ans="";
        int cnt=1;
        for(int i=1;i<val.length();i++){
            if(val.charAt(i)==val.charAt(i-1)) cnt++;
            else if(val.charAt(i)!=val.charAt(i-1) && cnt>1){
                ans=ans+val.charAt(i-1);
                ans=ans+cnt;
                cnt=1;
            }
            else ans=ans+val.charAt(i-1);
        }
        for(int i=0;i<ans.length();i++)
            chars[i]=ans.charAt(i);
        return ans.length();
    }
}