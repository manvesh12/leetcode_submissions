class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int [] dp1 = new int[nums.length];
        int [] dp2 = new int[nums.length];
       Arrays.fill(dp1,-1);
       Arrays.fill(dp2,-1);
        return Math.max(solve(0,n-2,dp1,nums),solve(1,n-1,dp2,nums));


    }
    public int solve(int a ,int b , int[] dp ,int [] nums){
        if(a>b) return 0 ;
        if(dp[a]!=-1){
            return dp[a];
        }
        
            int take = nums[a] + solve(a+2,b,dp,nums);
            int skip = solve(a+1,b,dp,nums);
            int max = Math.max(take,skip);
            dp[a]= max;
            return max;

        }
    }
