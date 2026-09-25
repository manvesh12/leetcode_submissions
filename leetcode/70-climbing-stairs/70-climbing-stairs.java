class Solution {
    public int climbStairs(int n) {
    int  [] arr = new int[n+1];
       return solve(n,arr);
        
    }
    public int solve (int n ,int []arr){
        int sum = 0 ;
        if(n<2) return 1;
        sum = solve(n-1,arr)+solve(n-2,arr);
        return sum;
    }
}