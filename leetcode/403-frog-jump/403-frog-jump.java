import java.util.*;

class Solution {
    public boolean canCross(int[] stones) {

        int n = stones.length;

        int[][] dp = new int[n][n + 1];

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int[] rows : dp) {
            Arrays.fill(rows, -1);
        }

        for (int i = 0; i < n; i++) {
            map.put(stones[i], i);
        }

        return solve(0, 0, dp, stones, map);
    }

    public boolean solve(int index, int k, int[][] dp,
                         int[] stones,
                         Map<Integer, Integer> map) {

        if (index == stones.length - 1) {
            return true;
        }

        if (dp[index][k] != -1) {
            return dp[index][k] == 1;
        }

        for (int nextJump = k - 1;
             nextJump <= k + 1;
             nextJump++) {

            if (nextJump <= 0) {
                continue;
            }

            int nextPosition = stones[index] + nextJump;

            if (map.containsKey(nextPosition)) {

                int nextIndex = map.get(nextPosition);

                if (solve(nextIndex, nextJump, dp, stones, map)) {
                    dp[index][k] = 1;
                    return true;
                }
            }
        }

        dp[index][k] = 0;
        return false;
    }
}