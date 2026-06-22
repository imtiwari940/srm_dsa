class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Target found
            if (nums[mid] == target) {
                return mid;
            }

            // Search in left half
            if (target < nums[mid]) {
                right = mid - 1;
            } 
            // Search in right half
            else {
                left = mid + 1;
            }
        }

        // Insert position
        return left;
    }
}