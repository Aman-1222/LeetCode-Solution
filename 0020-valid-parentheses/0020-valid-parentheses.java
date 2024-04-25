class Solution {
    public boolean isValid(String s) {
        char[] arr=s.toCharArray();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='(' || arr[i]=='[' || arr[i]=='{')
                st.push(arr[i]);
            else if(st.empty()) return false;
            else{
                char ch=st.pop();
                if((ch=='(' && arr[i]!=')') || (ch=='[' && arr[i]!=']') || (ch=='{' &&                          arr[i]!='}'))
                    return false;
            }
        }
        return (st.empty()==true);
    }
}