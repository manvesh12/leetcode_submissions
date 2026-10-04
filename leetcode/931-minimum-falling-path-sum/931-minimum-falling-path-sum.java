class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
         int n = matrix[0].length;
        Integer [][] dp = new Integer [m][n];
     return solve( 0,0,dp,matrix);   
    }
    public int solve( int a , int b , Integer[][] dp,int [][] matrix){
        if(dp[a][b]!=null) return dp[a][b];
        if(a == Matrix.length) return matrix[i][j];
        int down = solve(a+1,b,dp,matrix);
        int leftdiag = solve(a+1,b-1,dp,matrix);
        int rightdiag = solve(a+1,b+1,matrix);
        int min  = matrix[a][b] + Math.min(leftdiag,down,rightdiag);
        return min;
    }
}