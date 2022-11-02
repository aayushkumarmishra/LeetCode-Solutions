class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        // Dp - tabulation
        
        /*
        int n = cost.length;
        
        int dp[] = new int[n + 1];
        
        dp[0] = cost[0];
        dp[1] = cost[1];
        
        for(int i = 2; i < n; i++)
        {
            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
        }
        return Math.min(dp[n - 1], dp[n - 2]);
        
        */
        
        
        // space optimization
        int n = cost.length;
        
        int prev2 = cost[0];
        int prev1 = cost[1];
        
        for(int i = 2; i < n ; i++)
        {
            int curri = cost[i] + Math.min(prev2, prev1);
            
            prev2 = prev1;
            prev1 = curri;
        }
        
        return Math.min(prev2, prev1);
    }
}