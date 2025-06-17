class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int l=0,r=0;
        while(l<players.length && r<trainers.length){
            if(players[l]<=trainers[r]) l++;
            r++;
        }
        return l;
    }
}