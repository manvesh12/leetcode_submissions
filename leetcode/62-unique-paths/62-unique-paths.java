class Solution {
    public int uniquePaths(int m, int n) {
        int [][] dp = new int [m][n];
        for( int [] rows :dp){
            Arrays.fill(rows,-1);
        }
        return solve(0,0,m,n,dp);
    }
    public int solve( int a,int b ,int m, int n,int [][]dp ){
         if( a>=m || b>=n) return 0;
        if(dp[a][b]!=-1) return dp[a][b];
       
        if(a == m-1 &&b==n-1) return 1;
        
         int down =  solve(a+1,b,m,n,dp);
         int right= solve(a,b+1,m,n,dp);
            
        
        dp[a][b] = down + right  ;
        
        return dp[a][b];
    }
}