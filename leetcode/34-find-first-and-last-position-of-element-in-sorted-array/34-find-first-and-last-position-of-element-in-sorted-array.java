class Solution {
    public int[] searchRange(int[] nums, int target) {

        int n = nums.length;

        int start = -1;
        int end = -1;

        int low = 0;
        int high = n - 1;

        int[] arr = new int[2];

        // Find first occurrence
        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {

                start = mid;

                // Search on the left
                high = mid - 1;

            } 
            else if (nums[mid] < target) {

                low = mid + 1;

            } 
            else {

                high = mid - 1;
            }
        }

        // Reset binary search
        low = 0;
        high = n - 1;

        // Find last occurrence
        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {

                end = mid;

                // Search on the right
                low = mid + 1;

            } 
            else if (nums[mid] < target) {

                low = mid + 1;

            } 
            else {

                high = mid - 1;
            }
        }

        arr[0] = start;
        arr[1] = end;

        return arr;
    }
}