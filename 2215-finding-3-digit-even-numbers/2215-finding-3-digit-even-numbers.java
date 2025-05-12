class Solution {
    public int[] findEvenNumbers(int[] digits) {
        TreeSet<Integer> set = new TreeSet<>();
        int n=digits.length;
        for(int i=0;i<n;i++){
            if(digits[i]==0) continue;
            for(int j=0;j<n;j++){
                if(i==j) continue;
                for(int k=0;k<n;k++){
                    if(k==i || k==j) continue;
                    if(digits[k]%2==0)
                        set.add(digits[i]*100+digits[j]*10+digits[k]);        
                }
            }
        }
        int ans[] = new int[set.size()];
        int i=0;
        for(int num:set){
            ans[i]=num;
            i++;
        }
        return ans;
    }
}