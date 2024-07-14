class Solution {
    public String getSmallestString(String s) {
        StringBuffer ans=new StringBuffer();
        for(int i=0;i<s.length();i++){
            if(i<s.length()-1 && s.charAt(i)%2==s.charAt(i+1)%2 && s.charAt(i+1)<s.charAt(i) ){
                System.out.println(s.charAt(i));
                ans=ans.append(s.charAt(i+1));
                ans=ans.append(s.charAt(i));
                ans=ans.append(s,i+2,s.length());
                break;
            }
            else ans=ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}