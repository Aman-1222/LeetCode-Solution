class Solution {
    public int minRectanglesToCoverPoints(int[][] points, int w) {
        Arrays.sort(points,(point1,point2)->{
            if(point1[0]==point2[0]) return Integer.compare(point1[1],point2[1]);
            else return Integer.compare(point1[0],point2[0]);
        });
        int cnt=1;
        int initial=points[0][0];
        for(int i=1;i<points.length;i++){
            if((points[i][0]-initial)<=w) continue;
            else{
                cnt++;
                initial=points[i][0];
            }
        }
        return cnt;
    }
}