class Solution {
    public int thirdMax(int[] nums) {
       
        Integer max1 = null, max2 = null, max3 = null;
        
        for(Integer var : nums)
        {
            if(var.equals(max1) || var.equals(max2) || var.equals(max3))
            {
                continue;
            }
            if(max1 == null || var > max1)
            {
                max3 = max2;
                max2 = max1;
                max1 = var;
            }
            
            else if(max2 == null || var > max2)
            {
                max3 = max2;
                max2 = var;
            }
            else if(max3 == null || var > max3)
            {
                max3 = var;
            }
        }
        
        if(max3 == null)
        {
            return max1;
        }
        
        return max3;
        
    }
}