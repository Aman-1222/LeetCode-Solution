class Solution {
    public boolean check(int[] nums) {
//         Explanation
// Compare all neignbour elements (a,b) in A,
// the case of a > b can happen at most once.

// Note that the first element and the last element are also connected.

// If all a <= b, A is already sorted.
// If all a <= b but only one a > b,
// we can rotate and make b the first element.
// Other case, return false.


// Complexity
// Time O(n)
// Space O(1)
//        int k = 0, n = nums.length;
//         for (int i = 0; i < n; ++i) {
//             if (nums[i] > nums[(i + 1) % n]) {
//                 k++;
//             }
//             if (k > 1) {
//                 return false;
//             }
//         }
//         return true;
            int len=nums.length;
            int flag=0;
        for(int i=0;i<len-1;i++){
            if(nums[i]>nums[i+1]) flag++;
            if(flag==2) return false;
        }
        if(flag==0) return true;
        if(nums[0]>=nums[len-1]) return true;
        return false;
    }
}