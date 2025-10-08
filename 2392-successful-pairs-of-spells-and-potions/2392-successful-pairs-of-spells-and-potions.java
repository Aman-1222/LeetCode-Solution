class Solution {

    public int binarySearch(int []arr, double val){
        int low=0, high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=val) high=mid-1;
            else low=mid+1;
        }
        return low;
    }

    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int ans[] = new int[spells.length];
        int len = potions.length;
        Arrays.sort(potions);
        for(int i=0;i<spells.length;i++){
            ans[i]=len-binarySearch(potions,Math.ceil((success*1.0)/spells[i]));
        }
        return ans;
    }
}