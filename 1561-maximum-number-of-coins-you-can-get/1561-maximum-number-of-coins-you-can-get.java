class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int cnt=0;
        int j=piles.length-2;
        for(int i=1;i<=piles.length/3;i++){
            cnt+=piles[j];
            j-=2;
        }
        return cnt;
    }
}
