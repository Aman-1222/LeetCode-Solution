class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->{
            if(a[0]==b[0]) return a[1]-b[1];
            else return a[0]-b[0];
        });
        list.add(new ArrayList<>(Arrays.asList(intervals[0][0],intervals[0][1])));
        for(int i=1;i<intervals.length;i++){
            ArrayList<Integer> last=list.get(list.size()-1);
            if(last.get(1)>=intervals[i][0])
                last.set(1,Math.max(last.get(1),intervals[i][1]));
            else 
                list.add(new ArrayList<>(Arrays.asList(intervals[i][0],intervals[i][1])));
        }
        int [][]ans = new int[list.size()][2];
        for(int i=0;i<list.size();i++){
            ans[i][0]=list.get(i).get(0);
            ans[i][1]=list.get(i).get(1);
        }
        return ans;

    }
}