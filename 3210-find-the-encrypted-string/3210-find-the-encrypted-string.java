class Solution {
    public String getEncryptedString(String s, int k) {
        // String str="";
        // for(int i=0;i<s.length();i++)
        //     str+=s.charAt((i+k)%s.length());
        // return str;
        k=k%s.length();
        return s.substring(k)+s.substring(0,k);
    }
}