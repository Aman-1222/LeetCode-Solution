class Solution {
    public int findJudge(int n, int[][] trust) {
        HashSet<Integer> set=new HashSet<>();
        int len=0;
        int sum=(n*(n+1))/2;
        for(int i=0;i<trust.length;i++){
            if(!set.contains(trust[i][0])){
                len++;
                set.add(trust[i][0]);
                sum-=trust[i][0];
            }
        }
        if(len==n-1){
            int count=0;
            for(int i=0;i<trust.length;i++){
                if(trust[i][1]==sum) count++;
            }
            if(count==len) return sum;
            return -1;
        }
               return -1;
        
        
           
        // int[] count = new int[n+1];
        // for (int[] t: trust) {
        //     count[t[0]]--;
        //     count[t[1]]++;
        // }
        // for (int i = 1; i <= n; ++i) {
        //     if (count[i] == n - 1) return i;
        // }
        // return -1;
    }
    
}