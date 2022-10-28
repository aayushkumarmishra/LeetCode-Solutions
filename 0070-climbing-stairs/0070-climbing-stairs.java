class Solution {
    public int climbStairs(int n) {
        
        // like fib program
        
        int prev2 = 1;
        int prev1 = 1;
        
        for(int i = 2; i <= n; i++)
        {
            int curri = prev2 + prev1;
            
            prev2 = prev1;
            prev1 = curri;
        }
        
        return prev1;
    }
}
        
        /*.
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
*/