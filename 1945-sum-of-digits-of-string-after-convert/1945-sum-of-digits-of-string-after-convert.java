class Solution {
    public int getLucky(String s, int k) {
        int num=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            num=s.charAt(i)-'a'+1;
            while(num>0){
                ans+=num%10;
                num/=10;
            }
        }
        num=ans;
    for(int i=1;i<k;i++){
        ans=0;
        while(num>0){
            ans+=num%10;
            num/=10;
        }
        num=ans;
    }
        return ans;
    }
}
        
           
        
    //     String num="";
    //     int ans=0;
    //     for(int i=0;i<s.length();i++)
    //         num+=s.charAt(i)-96;  // => s.charAt(i)-'a'+1
    //     while(k>0){
    //         ans=0;
    //         for(int i=0;i<num.length();i++)
    //             ans+=num.charAt(i)-48;  // num.charAt(i)-'0'
    //         k--;
    //         num=""+ans;
    // }
    //     return ans;