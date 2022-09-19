class Solution {
    public boolean isPalindrome(int x) {
        
        int originalVal = x;
        int reverse = 0;
        
        while(x > 0)
        {
            reverse = (reverse * 10) + x % 10;
            x = x / 10;
        }
        
        if(reverse == originalVal)
        {
            return true;
        }
        
        return false;
    }
}