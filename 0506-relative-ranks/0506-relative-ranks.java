class Solution {
    public String[] findRelativeRanks(int[] score) {
        int len=score.length;
        String ans[]=new String[len];
        int copy[]= score.clone();
        Arrays.sort(copy);
        HashMap<Integer,String> map=new HashMap<>();
        int num=1;
        for(int i=len-1;i>=0;i--){
            if(i==len-1) map.put(copy[i],"Gold Medal");
            else if(i==len-2) map.put(copy[i],"Silver Medal");
            else if(i==len-3) map.put(copy[i],"Bronze Medal");
            else map.put(copy[i],Integer.toString(num));
            num++;
            }
        for(int i=0;i<score.length;i++){
            ans[i]=map.get(score[i]);
        }
        return ans;
    }
}