class Solution {
    public int pivotInteger(int n) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        int startSum=0, endSum=0;
        for(int i=1;i<=n;i++){
            startSum+=i;
            mpp.put(startSum,i);
        }
        for(int i=n;i>=1;i--){
            endSum+=i;
            if(mpp.containsKey(endSum) && mpp.get(endSum)==i ) return i;
        }
        return -1;
    }
}