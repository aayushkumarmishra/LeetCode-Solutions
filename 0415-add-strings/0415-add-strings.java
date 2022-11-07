class Solution {
    public String addStrings(String num1, String num2) {
        
        int aLen = num1.length() - 1;
        int bLen = num2.length() - 1;
        
        int carry = 0;
        
        StringBuilder sb = new StringBuilder();
        
        while(aLen >= 0 || bLen >= 0 || carry == 1)
        {
            if(aLen >= 0)
            {
                carry += num1.charAt(aLen) - '0';
                aLen--;
            }
            if(bLen >= 0)
            {
                carry += num2.charAt(bLen) - '0';
                bLen--;
            }
            
            sb.insert(0, carry % 10);
            carry /= 10;
        }
        
        return sb.toString();
    }
}