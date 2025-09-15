class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<brokenLetters.length();i++)
            set.add(brokenLetters.charAt(i));
      
        int cnt=0;
        for(int i=0;i<text.length();i++){ 
            if(set.contains(text.charAt(i))){
                while(i<text.length() && text.charAt(i)!=' ') i++;
            }
            else if(i==text.length()-1 || text.charAt(i)==' ') cnt++;
        }
        return cnt;
    }
}