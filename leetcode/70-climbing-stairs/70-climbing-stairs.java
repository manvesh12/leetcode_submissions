class Solution {
    public int climbStairs(int n) {
    int  [] arr = new int[n+1];
       return solve(n,arr);
        
    }
    public int solve (int n ,int []arr){
        int sum = 0 ;
        if(n<2) return 1;
        if(arr[n]!=0 )return arr[n];
        sum = solve(n-1,arr)+solve(n-2,arr);
        arr[n] = sum;
        return sum;
    }
}