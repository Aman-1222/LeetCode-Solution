class Solution {
    public int numSteps(String s) {
        int oddStep=0 , evenStep=0 , carry=0;
        for(int i=s.length()-1;i>=1;i--){
            if((s.charAt(i)+carry)%2==0)
                evenStep+=1;
            else{
                oddStep+=2;
                carry=1;
            }
        }
        return oddStep+evenStep+carry;
    }
}