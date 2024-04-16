class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int cnt=0;
        HashMap<Character,Integer> mpp=new HashMap<>();
        for(int i=0;i<stones.length();i++)
             mpp.put(stones.charAt(i),mpp.getOrDefault(stones.charAt(i),0)+1);
        for(int i=0;i<jewels.length();i++)
            cnt+=mpp.getOrDefault(jewels.charAt(i),0);
        return cnt;
    }
}