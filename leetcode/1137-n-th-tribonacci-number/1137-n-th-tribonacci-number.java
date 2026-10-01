class Solution {
    public int tribonacci(int n) {
       int [] dp = new int [n+1];
       Arrays.fill(dp,-1);
        return trib(n,dp);

    }
    public int trib(int n, int [] dp ){
    if(n<=1) return n;
    if(n==2) return 1;
    if(dp[n]!= -1) return dp[n];
    int max = trib(n-1,dp)+trib(n-2,dp)+trib(n-3,dp);
    dp[n] = max;
    return max;
    }
}