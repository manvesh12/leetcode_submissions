import java.util.Arrays;

class Solution {

    int maxSide = 0;

    public int maximalSquare(char[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        int[][] dp = new int[m][n];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        solve(0, 0, m, n, matrix, dp);

        return maxSide * maxSide;
    }

    public int solve(int a, int b, int m, int n,
                     char[][] matrix, int[][] dp) {

        // Matrix ke bahar chale gaye
        if (a >= m || b >= n) {
            return 0;
        }

        // Already calculated
        if (dp[a][b] != -1) {
            return dp[a][b];
        }

        // 3 directions
        int down = solve(a + 1, b, m, n, matrix, dp);

        int right = solve(a, b + 1, m, n, matrix, dp);

        int diagonal = solve(a + 1, b + 1, m, n, matrix, dp);

        // Current cell 1 hai
        if (matrix[a][b] == '1') {

            dp[a][b] = 1 + Math.min(
                    down,
                    Math.min(right, diagonal)
            );

            maxSide = Math.max(maxSide, dp[a][b]);

        } else {
            // Current cell 0 hai
            dp[a][b] = 0;
        }

        return dp[a][b];
    }
}