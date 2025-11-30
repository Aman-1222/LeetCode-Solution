class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> set=new HashSet<>();
        set.add(s.charAt(0));
        int ans=1;
        for(int i=1;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                ans++;
                set.add(s.charAt(i));
            }
        }
        return ans;
    }
}