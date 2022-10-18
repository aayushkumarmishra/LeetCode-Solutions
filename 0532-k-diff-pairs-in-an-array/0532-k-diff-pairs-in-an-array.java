class Solution {
    public int findPairs(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        
        for(int i : nums) map.put(i, map.getOrDefault(i,0)+1);
        
        int result = 0;
        
        for(int a : map.keySet())
        {
            if(k > 0 && map.containsKey(a + k) || k == 0 && map.get(a) > 1)
                result++;
        }
        return result;
    }
}