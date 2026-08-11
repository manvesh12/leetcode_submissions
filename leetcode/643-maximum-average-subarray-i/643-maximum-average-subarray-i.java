class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int n = nums.length;

        int[] prefix = new int[n];

        int sum = 0;
        

        double average = Double.NEGATIVE_INFINITY;
        double tempaverage = 0;

        for(int i = 0; i < n; i++) {
            sum += nums[i];
            prefix[i] = sum;
        }

        for(int end = k - 1; end < n; end++) {

            if(end == k - 1) {
                tempaverage = (double) prefix[end] / k;
            } else {
                tempaverage = (double)(prefix[end] - prefix[end-k]) / k;
            }

            if(tempaverage > average) {
                average = tempaverage;
            }

            
        }

        return average;
    }
}