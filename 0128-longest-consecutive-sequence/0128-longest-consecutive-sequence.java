import java.util.HashMap;
import java.util.Set;

class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashMap<Integer, Boolean> map = new HashMap<>();
        
        for(int var : nums)
        {
            map.put(var, true);
        }
        
        for(int var: nums)
        {
            if(map.containsKey(var -1))
            {
                map.put(var, false);
            }
        }
        
        Set<Integer> keySet = map.keySet();
        
        int max = 0;
        
        for(int var : keySet)
        {
            if(map.get(var) == true)
            {
               max = Math.max(max, findLength(map, var)); 
            }
        }
        return max;
    }
    
    private static int findLength(HashMap<Integer, Boolean> map, int k)
    {
        int ans = 0;
        
        while(map.containsKey(k))
        {
            ans++;
            k++;
        }
        
        return ans;
    }
}