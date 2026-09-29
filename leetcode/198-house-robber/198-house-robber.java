class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int [] dp = new int [n];
        Arrays.fill(dp,-1);
         return solve(0,nums,dp);
       }
       public int solve(int  i ,int []nums,int[]dp){
        if(i>=nums.length ) return 0 ;
        if(dp[i]!=-1){
                return dp[i];
            }
                int Max=Math.max(nums[i] + solve(i+2,nums,dp),solve(i+1,nums,dp));
                dp[i]= Max;
                return dp[i];
            }     
}