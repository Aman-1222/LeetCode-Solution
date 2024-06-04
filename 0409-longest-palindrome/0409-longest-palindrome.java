class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int cnt=0;
        int odd=0;
        for(int i=0;i<s.length();i++)
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);   
        for(int val: map.values()){
            cnt+=(val/2)*2;
            if(val%2!=0) odd=1;
        }
        return cnt+odd;
    }
}