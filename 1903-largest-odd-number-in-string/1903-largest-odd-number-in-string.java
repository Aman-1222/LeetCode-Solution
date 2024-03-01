class Solution {
    public String largestOddNumber(String num) {
        String ans="";
        int len=num.length();
        for(int i=len-1;i>=0;i--){
            if(num.charAt(i)%2!=0){
                ans=num.substring(0,i+1);
                return ans;
            }
        }
        return ans;
    }
}