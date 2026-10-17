
import java.util.*;

class Solution {

    public boolean wordBreak(String s, List<String> wordDict) {

        Boolean[] dp = new Boolean[s.length()];

        return solve(0, s, wordDict, dp);
    }

    public boolean solve(int i, String s,
                         List<String> wordDict,
                         Boolean[] dp) {

        if (i == s.length()) {
            return true;
        }

        if (dp[i] != null) {
            return dp[i];
        }

        for (String word : wordDict) {

            if (s.startsWith(word, i)) {

                if (solve(i + word.length(),
                          s, wordDict, dp)) {

                    return dp[i] = true;
                }
            }
        }

        return dp[i] = false;
    }
}
