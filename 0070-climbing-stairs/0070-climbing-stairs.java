class Solution {
    public int step(int n, int[] dp){
        if(n == 1) return 1;
        if(n == 2) return 2;
        if(dp[n] != -1) return dp[n];
        dp[n] = step(n-1, dp) + step(n-2, dp);
        return dp[n];
    }
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return step(n, dp);
    }
}