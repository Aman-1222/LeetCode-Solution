class Solution {
    public int[] findArray(int[] pref) {
        int xor=0;
        int ans[] = new int[pref.length];
        for(int i=0;i<pref.length;i++){
            ans[i]=xor^pref[i];
            xor=xor^ans[i];
        }
        return ans; 
    }
}