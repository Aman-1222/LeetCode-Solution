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

// class Solution {
//     public int[] findEvenNumbers(int[] digits) {
//         int[] mpp = new int[10];
//         for (int d : digits) mpp[d]++;
//         List<Integer> res = new ArrayList<>();
//         for (int i = 1; i <= 9; i++) {
//             if (mpp[i] == 0) continue;
//             mpp[i]--;
//             for (int j = 0; j <= 9; j++) {
//                 if (mpp[j] == 0) continue;
//                 mpp[j]--;
//                 for (int k = 0; k <= 8; k += 2) {
//                     if (mpp[k] == 0) continue;
//                     res.add(i*100 + j*10 + k);
//                 }
//                 mpp[j]++;
//             }
//             mpp[i]++;
//         }
//         return res.stream().mapToInt(Integer::intValue).toArray();
//     }
// }