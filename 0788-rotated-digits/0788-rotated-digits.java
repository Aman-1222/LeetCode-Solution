class Solution {
    public int rotatedDigits(int n) {
        int ans=0;
        for(int i=1;i<=n;i++){
            int rot=0, j=i, cnt=1;
            while(j>0){
                int dig=j%10;
                if(dig==3 || dig==4 || dig==7) break;
                if(dig==2) rot=5*cnt+rot;
                else if(dig==5) rot=2*cnt+rot;
                else if(dig==6) rot=9*cnt+rot;
                else if(dig==9) rot=6*cnt+rot;
                else rot=dig*cnt+rot;
                cnt*=10;
                j/=10;
            }
            if(rot!=i && j==0) 
                ans++;
        }
        return ans;
    }
}