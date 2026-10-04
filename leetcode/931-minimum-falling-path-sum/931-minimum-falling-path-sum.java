class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
         int n = matrix[0].length;
        Integer [][] dp = new Integer [m][n];
        int ans = Integer.MAX_VALUE;
        for( int i = 0 ;i<n;i++){
     int path=  solve( 0,i,m,n,dp,matrix);   
         ans = Math.min(ans,path);
        }
        return ans;
    }
    public int solve( int a , int b ,int m , int n , Integer[][] dp,int [][] matrix){
        if(b >= n || b < 0)
    return Integer.MAX_VALUE;

if(a == m-1)
    return matrix[a][b];
        if(dp[a][b]!=null) return dp[a][b];
        

        int down = solve(a+1,b,m,n,dp,matrix);
        int leftdiag = solve(a+1,b-1,m,n,dp,matrix);
        int rightdiag = solve(a+1,b+1,m,n,dp,matrix);
        int min  = matrix[a][b] + Math.min(leftdiag,Math.min(down,rightdiag));
        dp[a][b] = min;
        return min;
    }
}