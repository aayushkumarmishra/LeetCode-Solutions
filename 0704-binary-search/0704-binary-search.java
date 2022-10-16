class Solution {
    public int search(int[] nums, int target) {
        
        int len = nums.length -1;
        int s = 0;
        int e = len;
        
        while(s <= e)
        {
            int mid = (s+e)/2;
            
            if(target > nums[mid]) s = mid + 1;
            else if(target < nums[mid]) e = mid - 1;
            else return mid;
        }
        
        return -1;
        
    }
}