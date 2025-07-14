class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ele=s.charAt(i);
            if(ele=='{' || ele=='[' || ele=='(')
                st.push(ele);
            else if(st.empty()) return false;
            else{
                char top=st.pop();
                if(top=='(' && ele!=')') return false;
                else if(top=='{' && ele!='}') return false;
                else if(top=='{' && ele!='}') return false;
            }
        }
        return st.empty();
    }
}