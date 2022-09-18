class Solution {
    public int majorityElement(int[] nums) {
        
        int ansIndex = nums[0];
        int count = 1;
        
        for(int i =0 ; i < nums.length; i++)
        {
            int num = nums[i];
            if(num == ansIndex)
            {
                count++;
            }
            else
            {
                count--;
            }
            
            if(count == 0)
            {
                ansIndex = num;
                count = 1;
            }
        }
        return ansIndex;
        
    }
}