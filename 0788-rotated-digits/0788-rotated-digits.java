class Solution {
    public int rotatedDigits(int n) {
        int ans=0;
        for(int i=1;i<=n;i++){
            int j=i; boolean valid=false;
            while(j>0){
                int dig=j%10;
                if(dig==3 || dig==4 || dig==7) {
                    valid=false;
                    break;
                }
                else if(dig==2 ||dig==5 ||dig==6 ||dig==9 ) valid=true;
                j/=10;
            }
            if(valid) ans++;
        }
        return ans;
    }
}