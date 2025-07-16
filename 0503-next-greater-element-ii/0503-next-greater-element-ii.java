class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int len=nums.length;
        int ans[]=new int[len];
        Stack<Integer> st=new Stack<>();
        for(int i=2*len-1;i>=0;i--){
            while(!st.empty() && st.peek()<=nums[i%len])
                st.pop();
            if(i<len){
                if(st.empty()) ans[i]=-1;
                else ans[i]=st.peek();
            }
            st.push(nums[i%len]);
        }
        return ans;
    }
}