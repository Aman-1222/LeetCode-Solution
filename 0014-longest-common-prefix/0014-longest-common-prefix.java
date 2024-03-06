class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String ans="";
        for(int i=0;i<strs[0].length();i++){
            for(int j=1;j<strs.length;j++){
                if(strs[0].charAt(i)!=strs[j].charAt(i)) return ans;
            }
            ans+=strs[0].charAt(i);
        }
        return ans;
    }
}