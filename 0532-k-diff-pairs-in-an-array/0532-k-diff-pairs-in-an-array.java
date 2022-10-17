class Solution {
    public int findPairs(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int count = 0;
        
        for(int i : nums)
        {
            map.put(i, map.getOrDefault(i,0)+1);
        }
        
        for(int a : map.keySet())
        {
            if(k != 0)
            {
                int b = a + k;
                if(map.containsKey(b)) count ++;
            }
            else
            {
                if(map.get(a) >= 2) count++;
            }
        }
        return count;
    }
}