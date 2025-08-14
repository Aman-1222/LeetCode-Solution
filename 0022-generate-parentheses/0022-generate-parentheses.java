class Solution {
    public List<String> generateParenthesis(int n) {
        int oc=0, cc=0;
        List<String> ans=new ArrayList<>();
        generate(n,oc,cc,"",ans);
        return ans;
    }

    public void generate(int n,int oc,int cc,String brac,List<String> ans){
        if(oc==n && cc==n) {
            ans.add(brac);
            return;
        }
        if(oc<n) generate(n,oc+1,cc,brac+"(",ans);
        if(cc<oc) generate(n,oc,cc+1,brac+")",ans);
    }
}