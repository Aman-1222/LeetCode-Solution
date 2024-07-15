class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int len=colors.length;
        int cnt=0;
        for(int i=0;i<len;i++)
            if(colors[i]%2==colors[(i+2)%len]%2 && colors[(i+1)%len]%2!=colors[i]%2)
                cnt++;
        return cnt;
    }
}