class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int [] dp = new int [n];
        Arrays.fill(dp,-1);
        return Math.min(solve(0,cost,dp),solve(1,cost,dp));
    }
    public int solve(int a ,int[] cost,int [] dp ){
        if(a>=dp.length) return 0;
        if(dp[a]!=-1) return dp[a];
        int mincost = cost[a]+ Math.min(solve(a+1,cost,dp),solve(a+2,cost,dp));
    dp[a]= mincost;
    return mincost;
    }
}