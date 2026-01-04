class Solution {
    public String reverseWords(String s) {
        String ans="";
        int i=s.length()-1;
        int end=0;
        while(i>=0){
            while(i>=0 && s.charAt(i)==' ') i--;
            if(i>=0){
                end=i;
                while(i>=0 && s.charAt(i)!=' ') i--;
                String word=s.substring(i+1,end+1);
                if(ans.length()>0) ans=ans+" "+word;
                else ans=ans+word;
                // ans=ans+s.substring(i+1,end+1)+" ";
            }
        }
        return ans;
        // return ans.substring(0,ans.length()-1);



















        // Stack<String> st = new Stack<>();
        // String word="";
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)==' '){
        //         if(word.length()>0) st.push(word);
        //         word="";
        //     }
        //     else 
        //         word=word+s.charAt(i);
        // }
        // if(word.length()>0) st.push(word);
        // String ans="";
        // while(!st.empty()){
        //     ans=ans+st.pop()+" ";
        // }
        // return ans.substring(0,ans.length()-1);
    }
}