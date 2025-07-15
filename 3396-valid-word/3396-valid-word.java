class Solution {
    public boolean isValid(String word) {
        int constant=0, vowel=0;
        if(word.length()<3) return false;
        word=word.toLowerCase();
        for(int i=0;i<word.length();i++){
            int ch=word.charAt(i);
            if(!Character.isLetterOrDigit(ch)) return false;
            if(Character.isDigit(ch)) continue;
            if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u') vowel++;
            else constant++;
        }
        return (constant>=1 && vowel>=1);
    }
}