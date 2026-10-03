class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
         int n = grid[0].length;

         int [][]dp = new int [m][n];
          for( int [] rows : dp ){
            Arrays.fill(rows,-1);
          }
          return solve(0,0,m,n,dp,grid);
    }
    public int solve(int a , int b , int m , int n , int [][] dp,int[][] grid){
        if(a>=m || b>=n) return Integer.MAX_VALUE;
        if(a==m-1 && b ==n-1) return grid[a][b];
        if(dp[a][b]!=-1) return dp[a][b];
        int down =solve(a+1,b,m,n,dp,grid);
        int right =+solve(a,b+1,m,n,dp,grid);

        int min =  grid[a][b] + Math.min(down ,right);
        dp[a][b] = min;
        return min;
    }
}