class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int rowIndex = triangle.size();
        
        int [][] dp = new int[rowIndex][rowIndex];
        for( int [] rows : dp){
            Arrays.fill(rows,-1);
        }
        return solve(0,0,dp,triangle);
    }
    public int solve(int a , int b , int [][]dp,List<List<Integer>> tri){
        if(a == tri.size()-1){
            return tri.get(a).get(b);
        }
        if(dp[a][b]!=-1) return dp[a][b];

        int down = solve(a+1,b,dp,tri);
        int diagnol = solve(a+1,b+1,dp,tri);
        int min = tri.get(a).get(b) + Math.min(down,diagnol);
        dp[a][b] = min;
        return min;
    }
}