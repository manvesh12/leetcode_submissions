
import java.util.Arrays;

class Solution {

    public int numDecodings(String s) {

        int n = s.length();

        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        return solve(0, s, dp);
    }

    public int solve(int i, String s, int[] dp) {

        // Complete string decoded
        if (i == s.length()) {
            return 1;
        }

        // 0 cannot be decoded alone
        if (s.charAt(i) == '0') {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        // Choice 1: Take one digit
        int one = solve(i + 1, s, dp);

        // Choice 2: Take two digits
        int two = 0;

        if (i + 1 < s.length()) {

            int num = (s.charAt(i) - '0') * 10
                    + (s.charAt(i + 1) - '0');

            if (num >= 10 && num <= 26) {
                two = solve(i + 2, s, dp);
            }
        }

        return dp[i] = one + two;
    }
}
