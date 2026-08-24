class Solution {

    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = 0;

        // Find maximum pile
        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        int answer = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            long hours = 0;

            // Calculate total hours for speed mid
            for (int pile : piles) {

                hours += (pile + mid - 1) / mid;
            }

            if (hours <= h) {

                // mid works
                answer = mid;

                // Try smaller speed
                high = mid - 1;

            } else {

                // mid doesn't work
                low = mid + 1;
            }
        }

        return answer;
    }
}