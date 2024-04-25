class Solution {
    public boolean isValid(String s) {
        char[] arr=s.toCharArray();
        Stack<Character> st=new Stack<>();
        for(char ch:arr){
            if(ch=='(' || ch=='[' || ch=='{')
                st.push(ch);
            else if(st.empty()) return false;
            else{
                char c=st.pop();
                if((c=='(' && ch!=')') || (c=='[' && ch!=']') || (c=='{' && ch!='}'))
                    return false;
            }
        }
        return (st.empty()==true);
    }
}