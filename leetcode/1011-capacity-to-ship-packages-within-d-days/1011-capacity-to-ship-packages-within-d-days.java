class Solution {

    public int shipWithinDays(int[] weights, int days) {

        int low = 0;
        int high = 0;

        // Minimum capacity = heaviest package
        // Maximum capacity = total weight
        for (int weight : weights) {
            low = Math.max(low, weight);
            high += weight;
        }

        int answer = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int requiredDays = 1;
            int currentWeight = 0;

            for (int weight : weights) {

                if (currentWeight + weight <= mid) {

                    currentWeight += weight;

                } else {

                    requiredDays++;
                    currentWeight = weight;
                }
            }

            // mid capacity is possible
            if (requiredDays <= days) {

                answer = mid;

                // Try smaller capacity
                high = mid - 1;

            } else {

                // Capacity is too small
                low = mid + 1;
            }
        }

        return answer;
    }
}