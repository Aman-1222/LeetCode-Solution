class Solution {
    public long sumAndMultiply(int n) {
        String s="";
        int sum=0;
        String str=""+n;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='0'){
                sum=sum+(str.charAt(i)-'0');
                s=s+str.charAt(i);
            }
        }
        if(s=="") return 0;
        long ans=Long.parseLong(s);
        ans=ans*sum;
        return ans; 
    }
}