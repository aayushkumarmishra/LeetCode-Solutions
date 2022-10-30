class Solution {
    
    private Integer[] dp;
    
    public int rob(int[] nums) {
        dp = new Integer[nums.length];
        return rob(nums, 0);
    }
    
    private int rob(int wealth[], int currentIndex)
    {
        if(currentIndex >= wealth.length) return 0;
        
        if(dp[currentIndex] != null)
            return dp[currentIndex];
        
        int stealCurrent = wealth[currentIndex] + rob(wealth, currentIndex + 2);
        int skipCurrent = rob(wealth, currentIndex + 1);
        
        return dp[currentIndex] = Math.max(stealCurrent, skipCurrent);
    }
}