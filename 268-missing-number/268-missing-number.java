class Solution {
    public int missingNumber(int[] nums) {
        
        int n = nums.length;
        int expectedTotal = n*(n+1)/2;
        int total = 0;
        
        for(int i = 0; i < n ; i++)
        {
            total = total + nums[i];
        }
        
        return expectedTotal - total;
    }
}