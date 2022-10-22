class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int ans = Integer.MIN_VALUE;
        
        for(int i = 0; i < k; i++)
        {
            pq.add(nums[i]);
        }
        
        for(int i = k; i < nums.length; i++)
        {
            int min = pq.peek();
            if(min < nums[i])
            {
                pq.remove();
                pq.add(nums[i]);
            }
        }
        
        return ans = pq.peek();
        
        /*while(!pq.isEmpty())
        {
           ans =  pq.remove();
        }
        */
        //return ans;
    }
}