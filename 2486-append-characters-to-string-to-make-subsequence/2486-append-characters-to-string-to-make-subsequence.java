class Solution {
    public int appendCharacters(String s, String t) {
        int j=0, i=0;
        while(i<t.length()){
            while(j<s.length()){
                if(t.charAt(i)==s.charAt(j)){
                    j++;
                    i++;
                    break;
                }
                j++;
            }
            if(j==s.length()) break;
        }
        return t.length()-i;
    }
}