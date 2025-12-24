class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int totalApples=0;
        for(int i=0;i<apple.length;i++) totalApples+=apple[i];
        int cnt=0;
        int totCap=0;
        for(int i=capacity.length-1;i>=0;i--){
            totCap+=capacity[i];
            cnt++;
            if(totCap>=totalApples) break;
        } 
        return cnt;
    }
}