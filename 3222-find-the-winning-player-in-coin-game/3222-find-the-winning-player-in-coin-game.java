class Solution {
    public String losingPlayer(int x, int y) {
       if(x<=y/4 && x%2==0) return "Bob";
       else if(x<=y/4 && x%2!=0) return "Alice";
       else if(x>y/4 && (y/4)%2==0) return "Bob";
       else return "Alice"; 
    }
}