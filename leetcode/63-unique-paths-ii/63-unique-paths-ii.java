class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int [][] dp = new int [m][n];
        for( int [] rows : dp ){
            Arrays.fill(rows,-1);
        }
        return solve(0,0,m,n,dp,obstacleGrid);
    }
    public int solve(int a , int b , int m ,int n , int [][] dp , int [][] obstacleGrid){
        if(a>=m || b>=n) return 0;
        if(obstacleGrid[a][b]==1) return 0;
        if(a== m-1 && b == n-1) return 1;
        if(dp[a][b]!=-1) return dp[a][b];
        int down = solve(a+1,b,m,n,dp,obstacleGrid);
        int right = solve(a,b+1,m,n,dp,obstacleGrid);
        dp[a][b] = down+ right;
        return dp[a][b];
    }
}