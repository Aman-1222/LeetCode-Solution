class Solution {
    public int getLucky(String s, int k) {
        String num="";
        int ans=0;
        for(int i=0;i<s.length();i++)
            num+=s.charAt(i)-96; 
        while(k>0){
            ans=0;
            for(int i=0;i<num.length();i++)
                ans+=num.charAt(i)-48;
            k--;
            num=""+ans;
    }
        return ans;
    }
}