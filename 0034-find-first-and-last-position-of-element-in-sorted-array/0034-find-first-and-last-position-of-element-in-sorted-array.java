class Solution {
    public int[] searchRange(int[] nums, int target) {
     int[] result = {-1, -1};
        if (nums.length == 0) return result;

        // Find first occurrence
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                if (nums[mid] == target) result[0] = mid;
                high = mid - 1;
            }
        }

        // Find last occurrence
        low = 0;
        high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > target) {
                high = mid - 1;
            } else {
                if (nums[mid] == target) result[1] = mid;
                low = mid + 1;
            }
        }

        return result;
    }
}