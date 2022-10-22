class Solution {
    public int[] sortArray(int[] nums) {
        
        int arr[] = new int[nums.length];
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        
        for(int val : nums)
        {
            pq.add(val);
        }
        
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = pq.remove();
        }
        
        return arr;
        
    }
}