class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int rowIndex = triangle.size();
        
        Integer [][] dp = new Integer [rowIndex][rowIndex];
      
        return solve(0,0,dp,triangle);
    }
    public int solve(int a , int b , Integer [][]dp,List<List<Integer>> tri){
        if(a == tri.size()-1){
            return tri.get(a).get(b);
        }
        if(dp[a][b]!=null) return dp[a][b];

        int down = solve(a+1,b,dp,tri);
        int diagnol = solve(a+1,b+1,dp,tri);
        int min = tri.get(a).get(b) + Math.min(down,diagnol);
        dp[a][b] = min;
        return min;
    }
}