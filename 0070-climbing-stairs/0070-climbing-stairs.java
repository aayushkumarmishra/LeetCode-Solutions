class Solution {
    public int climbStairs(int n) {
        
        // like fib program.
        
        int storage[] = new int [n + 1];
        
        int ans = call(n, storage);
        return ans;
        
    }
    
    public static int call(int n, int storage[])
    {
        if(n <= 1) return 1;
        
        if(storage[n] > 0) return storage[n];
        
        int ans = call(n - 1, storage) + call(n - 2, storage);
        
        storage[n] = ans;
        
        return storage[n];
    }
}