class Solution {
    public String reverseWords(String s) {
        Stack<String> st = new Stack<>();
        String word="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                if(word.length()>0) st.push(word);
                word="";
            }
            else 
                word=word+s.charAt(i);
        }
        if(word.length()>0) st.push(word);
        String ans="";
        while(!st.empty()){
            ans=ans+st.pop()+" ";
        }
        return ans.substring(0,ans.length()-1);
    }
}