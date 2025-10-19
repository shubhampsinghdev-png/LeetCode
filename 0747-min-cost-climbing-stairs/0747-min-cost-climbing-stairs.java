class Solution {
    public int cost(int[] cost,int n, int[] dp){
        if(n >= cost.length) return 0;
        if(dp[n] != -1) return dp[n];
        int first = cost(cost, n+1, dp);
        int second = cost(cost, n+2, dp);
        return dp[n] = cost[n] + Math.min(first, second);
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return Math.min(cost(cost, 0, dp), cost(cost, 1, dp));
    }
}