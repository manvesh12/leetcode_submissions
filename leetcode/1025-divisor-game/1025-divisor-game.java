
class Solution {

    public boolean divisorGame(int n) {

        Boolean[] dp = new Boolean[n + 1];

        return solve(n, dp);
    }

    public boolean solve(int n, Boolean[] dp) {

        // No possible move
        if (n == 1) {
            return false;
        }

        // Already calculated
        if (dp[n] != null) {
            return dp[n];
        }

        // Try every valid divisor
        for (int x = 1; x < n; x++) {

            if (n % x == 0) {

                boolean opponent = solve(n - x, dp);

                if (opponent == false) {
                    return dp[n] = true;
                }
            }
        }

        return dp[n] = false;
    }
}
