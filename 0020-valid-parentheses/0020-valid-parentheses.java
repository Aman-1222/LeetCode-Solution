class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='{' || ch=='[' || ch=='(')
                st.push(ch);
            else if(st.empty()) return false;
            else{
                char ch1=st.pop();
                if(ch1=='(' && ch!=')') return false;
                else if(ch1=='{' && ch!='}') return false;
                else if(ch1=='{' && ch!='}') return false;
            }
        }
        return st.empty();
    }
}