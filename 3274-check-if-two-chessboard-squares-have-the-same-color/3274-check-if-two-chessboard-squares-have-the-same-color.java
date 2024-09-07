class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        return (coordinate1.charAt(0)+coordinate2.charAt(0))%2 == (coordinate1.charAt(1)+coordinate2.charAt(1))%2?true:false;
    }
}