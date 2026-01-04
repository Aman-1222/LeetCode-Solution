class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=fourDivisors(nums[i]);
        }
        return sum;
    }

    public int fourDivisors(int n){
        int val=-1;
        int cnt=0;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) {
                if(n/i!=i){
                    cnt++;
                    val=i+n/i;
                }
                else return 0;
            }
            if(cnt==2) return 0;
        }
        if(val==-1) return 0;
        return val+1+n;
    }
}