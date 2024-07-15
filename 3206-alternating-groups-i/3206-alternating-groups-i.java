class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int len=colors.length;
        int cnt=0;
        for(int i=0;i<len;i++)
            if(colors[i]==colors[(i+2)%len] && colors[(i+1)%len]!=colors[i])
                cnt++;
        return cnt;
    }
}